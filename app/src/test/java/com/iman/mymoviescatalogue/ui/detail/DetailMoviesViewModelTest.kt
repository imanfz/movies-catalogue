package com.iman.mymoviescatalogue.ui.detail

import com.iman.mymoviescatalogue.utils.DataDummy
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.ExpectedException


class DetailMoviesViewModelTest {
    private lateinit var viewModel: DetailMoviesViewModel
    private val dummyMovies = DataDummy.generateDummyMovies()[0]
    private val title = dummyMovies.title

    @get:Rule
    var thrown = ExpectedException.none()

    @Before
    fun setUp() {
        viewModel = DetailMoviesViewModel()
        viewModel.setSelectedMovies(title)
    }


    @Test
    fun getMovies() {
        val moviesEntity = viewModel.getMovies(1)
        assertNotNull(moviesEntity)
        assertEquals(dummyMovies.title, moviesEntity.title)
        assertEquals(dummyMovies.imagePath, moviesEntity.imagePath)
        assertEquals(dummyMovies.genre, moviesEntity.genre)
        assertEquals(dummyMovies.overview, moviesEntity.overview)
        assertEquals(dummyMovies.user_score, moviesEntity.user_score)
        assertEquals(dummyMovies.release, moviesEntity.release)
    }

    @Test
    fun getTvShow() {
        val tvShowEntity = viewModel.getMovies(2)
        assertNotNull(tvShowEntity)
        assertEquals(dummyMovies.title, tvShowEntity.title)
        assertEquals(dummyMovies.imagePath, tvShowEntity.imagePath)
        assertEquals(dummyMovies.genre, tvShowEntity.genre)
        assertEquals(dummyMovies.overview, tvShowEntity.overview)
        assertEquals(dummyMovies.user_score, tvShowEntity.user_score)
        assertEquals(dummyMovies.release, tvShowEntity.release)
    }

    @Test
    @Throws(AssertionError::class)
    fun getMoviesTitle() {
        val moviesEntity = viewModel.getMovies(1)
        thrown.expect(AssertionError::class.java)
        thrown.expectMessage("expected:<Alita: Battle Angel> but was:<null>")
        assertEquals(dummyMovies.title, null)
        assertEquals(dummyMovies.imagePath, moviesEntity.imagePath)
        assertEquals(dummyMovies.genre, moviesEntity.genre)
        assertEquals(dummyMovies.overview, moviesEntity.overview)
        assertEquals(dummyMovies.user_score, moviesEntity.user_score)
        assertEquals(dummyMovies.release, moviesEntity.release)
    }
}