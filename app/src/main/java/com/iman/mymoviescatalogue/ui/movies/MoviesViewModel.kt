package com.iman.mymoviescatalogue.ui.movies

import androidx.lifecycle.ViewModel
import com.iman.mymoviescatalogue.data.MoviesEntity
import com.iman.mymoviescatalogue.utils.DataDummy

class MoviesViewModel  : ViewModel() {

    fun getMovies(): List<MoviesEntity> = DataDummy.generateDummyMovies()
}