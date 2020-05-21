package id.fathonyfath.hilt.sample

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SimpleFragment: Fragment(R.layout.fragment_simple) {

    private val simpleViewModel by viewModels<SimpleViewModel>()
    private val activitySimpleViewModel by activityViewModels<SimpleViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("SimpleFragment", simpleViewModel.hi())
        Log.d("SimpleFragment", activitySimpleViewModel.hi())
    }
}