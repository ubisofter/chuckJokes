package app.devuniverse.chuck

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class JokeDetailDialogFragment(private val jokeText: String) : DialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_joke_detail, container, false)

        // Настройте UI элементы, например, TextView, чтобы отобразить текст шутки.
        val jokeTextView = view.findViewById<TextView>(R.id.jokeDTV)
        jokeTextView.text = jokeText

        // Настройте кнопку "Ahahah" для закрытия диалогового окна
        val closeButton = view.findViewById<Button>(R.id.closeButton)
        closeButton.setOnClickListener {
            dismiss() // Закрыть диалоговое окно по нажатию кнопки
        }

        return view
    }

    override fun onStart() {
        super.onStart()

        // Задайте параметры окна (размер, анимация и другие)
        val dialog = dialog
        if (dialog != null) {
            dialog.window?.setBackgroundDrawableResource(android.R.color.transparent) // Сделать фон прозрачным
        }
    }
}
