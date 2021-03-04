package com.iman.mymoviescatalogue.ui.detail

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.iman.mymoviescatalogue.R
import com.iman.mymoviescatalogue.data.MoviesEntity
import com.iman.mymoviescatalogue.databinding.ActivityDetailsMoviesBinding

class DetailsMoviesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsMoviesBinding

    companion object {
        const val EXTRA_COURSE = "extra_course"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsMoviesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        showDetail()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun showDetail(){
        val extras = intent.extras
        if (extras!=null){
            val movies = extras.getParcelable<MoviesEntity>(EXTRA_COURSE) as MoviesEntity
            binding.textTitle.text = movies.title
            binding.imagePoster.loadImage(movies.imagePath)
            binding.textRelease.text = resources.getString(R.string.date, movies.release)
            binding.textGenre.text = resources.getString(R.string.genre ,movies.genre)
            binding.textOverviews.text = movies.overview
            binding.btnWatch.setOnClickListener {
                Toast.makeText(it.context, "Anda menonton ${movies.title}", Toast.LENGTH_SHORT).show()
            }
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