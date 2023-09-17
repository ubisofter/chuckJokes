package app.devuniverse.chuck

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class JokeListFragment : Fragment() {

    @Inject
    lateinit var viewModel: JokeListViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_joke_list, container, false)

        // Внедрение зависимостей во фрагменте
        (requireActivity().applicationContext as MyApplication).appComponent.inject(this)

        Log.d("JokeListFragment", "onCreateView called")

        val recyclerView = view.findViewById<RecyclerView>(R.id.jokeRecyclerView)

        // Установка менеджера макета (например, LinearLayoutManager)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val adapter = JokeListAdapter { jokeText ->
            // Обработчик клика на элемент RecyclerView
            val dialogFragment = JokeDetailDialogFragment(jokeText)
            dialogFragment.show(childFragmentManager, "JokeDetailDialogFragment")
        }

        // Установите адаптер для RecyclerView
        recyclerView.adapter = adapter

        viewModel.jokes.observe(viewLifecycleOwner) { jokesWithImages ->
            adapter.setData(jokesWithImages)
        }

        viewModel.loadMultipleJokes() // Загрузите шутки, когда фрагмент создан

        val progressBar = view.findViewById<ProgressBar>(R.id.progressBar)
        val jokeCountTextView = view.findViewById<TextView>(R.id.jokeCounter)

        viewModel.isLoading.observe(viewLifecycleOwner) { isLoading ->
            if (isLoading) {
                // Показать ProgressBar
                progressBar.visibility = View.VISIBLE
                jokeCountTextView.visibility = View.VISIBLE
            } else {
                // Скрыть ProgressBar и отобразить количество загруженных шуток
                progressBar.visibility = View.GONE
                jokeCountTextView.visibility = View.GONE
            }
        }

        return view
    }

}