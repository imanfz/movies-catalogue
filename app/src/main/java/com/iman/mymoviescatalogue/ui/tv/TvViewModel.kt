package com.iman.mymoviescatalogue.ui.tv

import androidx.lifecycle.ViewModel
import com.iman.mymoviescatalogue.data.MoviesEntity
import com.iman.mymoviescatalogue.utils.DataDummy

class TvViewModel  : ViewModel() {

    fun getTvShow(): List<MoviesEntity> = DataDummy.generateDummyTvShow()
}