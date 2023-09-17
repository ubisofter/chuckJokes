package app.devuniverse.chuck

import androidx.recyclerview.widget.DiffUtil

class JokeDiffCallback : DiffUtil.ItemCallback<ChuckNorrisJoke>() {
    override fun areItemsTheSame(oldItem: ChuckNorrisJoke, newItem: ChuckNorrisJoke): Boolean {
        // Определите, что делает элементы одинаковыми (например, сравните по id)
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: ChuckNorrisJoke, newItem: ChuckNorrisJoke): Boolean {
        // Определите, что делает элементы одинаковыми с точки зрения содержимого (например, сравните по значению)
        return oldItem == newItem
    }
}