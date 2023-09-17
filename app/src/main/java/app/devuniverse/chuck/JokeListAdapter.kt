package app.devuniverse.chuck

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class JokeListAdapter (private val onItemClick: (String) -> Unit): RecyclerView.Adapter<JokeListAdapter.ViewHolder>(){

    private var jokesWithImages: List<ChuckNorrisJokeWithImage> = emptyList()


    fun setData(jokesWithImages: List<ChuckNorrisJokeWithImage>) {
        this.jokesWithImages = jokesWithImages
        notifyDataSetChanged()
        Log.d("JokeListAdapter", "setData called with ${jokesWithImages.size} jokes")
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_joke, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val jokeWithImage = jokesWithImages[position]
        //holder.jokeTextView.text = jokeWithImage.joke.value
        Picasso.get().load(jokeWithImage.imageUrl).into(holder.jokeImageView)
        holder.jokeTextView.text = jokeWithImage.jokeTitle
        Log.d("JokeListAdapter", "onBindViewHolder called for position $position with joke: ${jokeWithImage.joke.value}")

        // Добавьте обработчик клика на элемент RecyclerView
        holder.itemView.setOnClickListener {
            onItemClick?.invoke(jokeWithImage.joke.value) // Вызовите обработчик клика с текстом шутки
        }
    }

    override fun getItemCount(): Int {
        return jokesWithImages.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val jokeTextView: TextView = itemView.findViewById(R.id.jokeTitleTextView)
        val jokeImageView: ImageView = itemView.findViewById(R.id.jokeIV)
    }
}


