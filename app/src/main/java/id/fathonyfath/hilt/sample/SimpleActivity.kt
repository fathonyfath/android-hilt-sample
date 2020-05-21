package id.fathonyfath.hilt.sample

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SimpleActivity : AppCompatActivity(R.layout.activity_simple) {

    private val simpleViewModel by viewModels<SimpleViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("SimpleActivity", simpleViewModel.hi())

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .add(R.id.fragment_container, SimpleFragment())
                    .commit()

            simpleViewModel.saveState()
        }

        Log.d("SimpleActivity", "Created time: ${simpleViewModel.getSavedState()}")
    }
}
