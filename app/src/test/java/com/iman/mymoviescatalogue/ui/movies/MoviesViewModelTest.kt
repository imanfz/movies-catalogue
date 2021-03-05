package com.iman.mymoviescatalogue.ui.movies

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.ExpectedException

class MoviesViewModelTest {
    private lateinit var viewModel: MoviesViewModel

    @get:Rule
    var thrown = ExpectedException.none()

    @Before
    fun setUp() {
        viewModel = MoviesViewModel()
    }

    @Test
    fun getMovies() {
        val moviesEntities = viewModel.getMovies()
        assertNotNull(moviesEntities)
        assertEquals(10, moviesEntities.size)
    }


    @Test
    @Throws(AssertionError::class)
    fun getMoviesTestNull() {
        val moviesEntities = viewModel.getMovies()
        thrown.expect(AssertionError::class.java)
        thrown.expectMessage("expected:<null> but was:<10>")
        assertEquals(null, moviesEntities.size)
    }
}