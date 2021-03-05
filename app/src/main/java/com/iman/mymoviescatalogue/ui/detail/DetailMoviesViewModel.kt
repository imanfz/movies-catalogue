package com.iman.mymoviescatalogue.ui.detail

import androidx.lifecycle.ViewModel
import com.iman.mymoviescatalogue.data.MoviesEntity
import com.iman.mymoviescatalogue.utils.DataDummy

class DetailMoviesViewModel: ViewModel() {
    private lateinit var title: String

    fun setSelectedMovies(title: String) {
        this.title = title
    }

    fun getMovies(flag: Int): MoviesEntity {
        lateinit var movies: MoviesEntity

        val moviesEntities = when(flag) {
            1 -> DataDummy.generateDummyMovies()
            else -> DataDummy.generateDummyTvShow()
        }

        for (moviesEntity in moviesEntities) {
            if (moviesEntity.title == title) {
                movies = moviesEntity
            }
        }

        return movies
    }

}