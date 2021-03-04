package com.iman.mymoviescatalogue.ui.tv

import com.iman.mymoviescatalogue.data.MoviesEntity

interface TvShowFragmentCallback {
    fun onShareClick(movies: MoviesEntity)
}