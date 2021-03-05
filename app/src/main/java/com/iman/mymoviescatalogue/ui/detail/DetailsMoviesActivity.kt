package com.iman.mymoviescatalogue.ui.detail

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.iman.mymoviescatalogue.R
import com.iman.mymoviescatalogue.data.MoviesEntity
import com.iman.mymoviescatalogue.databinding.ActivityDetailsMoviesBinding

class DetailsMoviesActivity : AppCompatActivity() {
    private var _binding: ActivityDetailsMoviesBinding? = null
    private val binding get() = _binding!!

    companion object {
        const val EXTRA_MOVIES = "extra_movies"
        const val EXTRA_FLAG = "extra_flag"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityDetailsMoviesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DetailMoviesViewModel::class.java]

        val extras = intent.extras
        if (extras != null) {
            val title = extras.getString(EXTRA_MOVIES)
            val flag = extras.getInt(EXTRA_FLAG)
            if (title != null) {
                viewModel.setSelectedMovies(title)
                populateMovies(viewModel.getMovies(flag))
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun populateMovies(movies: MoviesEntity){
        binding.textTitle.text = movies.title
        binding.imagePoster.loadImage(movies.imagePath)
        binding.textScore.text = movies.user_score.toString()
        binding.textOverviews.text = movies.overview
        binding.textRelease.text = resources.getString(R.string.date, movies.release)
        binding.textGenre.text = resources.getString(R.string.genre, movies.genre)
        binding.btnWatch.setOnClickListener {
            Toast.makeText(it.context, "Anda menonton ${movies.title}", Toast.LENGTH_SHORT).show()
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

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}