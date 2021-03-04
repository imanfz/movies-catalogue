package com.iman.mymoviescatalogue.ui.tv

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.iman.mymoviescatalogue.R
import com.iman.mymoviescatalogue.data.MoviesEntity
import com.iman.mymoviescatalogue.databinding.ItemsTvShowBinding
import com.iman.mymoviescatalogue.ui.detail.DetailsMoviesActivity

class TvShowAdapter(private val callback: TvShowFragmentCallback) : RecyclerView.Adapter<TvShowAdapter.TvShowViewHolder>() {
    private var listtvshow = ArrayList<MoviesEntity>()

    fun setMovies(movies: List<MoviesEntity>?) {
        if (movies == null) return
        this.listtvshow.clear()
        this.listtvshow.addAll(movies)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowViewHolder {
        val itemsTvShowBinding = ItemsTvShowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvShowViewHolder(itemsTvShowBinding)
    }

    override fun onBindViewHolder(holder: TvShowViewHolder, position: Int) {
        val course = listtvshow[position]
        holder.bind(course)
    }

    override fun getItemCount(): Int = listtvshow.size


    inner class TvShowViewHolder(private val binding: ItemsTvShowBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(tvshow: MoviesEntity) {
            with(binding) {
                tvItemTitle.text = tvshow.title
                tvItemDate.text = itemView.resources.getString(R.string.date, tvshow.release)
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailsMoviesActivity::class.java)
                    intent.putExtra(DetailsMoviesActivity.EXTRA_COURSE, tvshow)
                    itemView.context.startActivity(intent)
                }
                imgShare.setOnClickListener { callback.onShareClick(tvshow) }
                imgPoster.loadImage(tvshow.imagePath)
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