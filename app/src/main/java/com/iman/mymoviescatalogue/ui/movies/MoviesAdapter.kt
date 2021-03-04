package com.iman.mymoviescatalogue.ui.movies

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.iman.mymoviescatalogue.R
import com.iman.mymoviescatalogue.data.MoviesEntity
import com.iman.mymoviescatalogue.databinding.ItemsMoviesBinding
import com.iman.mymoviescatalogue.ui.detail.DetailsMoviesActivity

class MoviesAdapter : RecyclerView.Adapter<MoviesAdapter.MoviesViewHolder>() {
    private var listmovies = ArrayList<MoviesEntity>()

    fun setMovies(movies: List<MoviesEntity>?) {
        if (movies == null) return
        this.listmovies.clear()
        this.listmovies.addAll(movies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val itemsAcademyBinding = ItemsMoviesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MoviesViewHolder(itemsAcademyBinding)
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        val course = listmovies[position]
        holder.bind(course)
    }

    override fun getItemCount(): Int = listmovies.size


    class MoviesViewHolder(private val binding: ItemsMoviesBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(movies: MoviesEntity) {
            with(binding) {
                tvItemTitle.text = movies.title
                tvItemDate.text = itemView.resources.getString(R.string.date, movies.release)
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailsMoviesActivity::class.java)
                    intent.putExtra(DetailsMoviesActivity.EXTRA_COURSE, movies)
                    itemView.context.startActivity(intent)
                }
                imgPoster.loadImage(movies.imagePath)
            }
        }

        private fun ImageView.loadImage(imagePath: Int){
            Glide.with(this)
                .load(imagePath)
                .apply(
                    RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error))
                .into(this)
        }
    }
}