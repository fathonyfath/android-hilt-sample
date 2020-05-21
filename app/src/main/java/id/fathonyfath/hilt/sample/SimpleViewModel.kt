package id.fathonyfath.hilt.sample

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class SimpleViewModel @ViewModelInject constructor(
    manager: MyManager,
    @Assisted private val savedState: SavedStateHandle
): ViewModel() {
    fun hi() = "$this - hi"

    fun saveState() {
        savedState[CREATED_AT] = System.currentTimeMillis()
    }

    fun getSavedState() = savedState.get<Long>(CREATED_AT)

    companion object {
        const val CREATED_AT = "CreatedAt"
    }
}

class MyManager @Inject constructor()