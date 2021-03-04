package com.iman.mymoviescatalogue.ui.tv

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ShareCompat
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.iman.mymoviescatalogue.R
import com.iman.mymoviescatalogue.data.MoviesEntity
import com.iman.mymoviescatalogue.databinding.FragmentTvShowBinding

class TvShowFragment : Fragment(), TvShowFragmentCallback {

    private var _fragmentTvShowBinding : FragmentTvShowBinding? = null
    private val fragmentTvShowBinding get() = _fragmentTvShowBinding as FragmentTvShowBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _fragmentTvShowBinding = FragmentTvShowBinding.inflate(inflater, container, false)
        return fragmentTvShowBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[TvViewModel::class.java]
            val courses = viewModel.getTvShow()

            val adapter = TvShowAdapter(this)
            adapter.setMovies(courses)

            with(fragmentTvShowBinding.rvTvShow) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                this.adapter = adapter
            }
        }
    }

    override fun onShareClick(movies: MoviesEntity) {
        if (activity != null) {
            val mimeType = "text/plain"
            ShareCompat.IntentBuilder
                .from(requireActivity())
                .setType(mimeType)
                .setChooserTitle("Bagikan aplikasi ini sekarang.")
                .setText(resources.getString(R.string.share_text, movies.title))
                .startChooser()
        }
    }
}