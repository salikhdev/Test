package uz.salikhdev.test.ui.viewmodel

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import uz.salikhdev.test.core.model.camera.CameraResponse
import uz.salikhdev.test.core.model.home.RoomResponse
import uz.salikhdev.test.core.repository.BaseRepository
import uz.salikhdev.test.core.util.WrapperClass
import javax.inject.Inject

@HiltViewModel
class BaseViewModel @Inject constructor(
    private val repo: BaseRepository
) : ViewModel() {

    val dataCamera: MutableState<WrapperClass<CameraResponse?, Exception>> =
        mutableStateOf(WrapperClass(null, null))
    val dataRoom: MutableState<WrapperClass<RoomResponse?, Exception>> =
        mutableStateOf(WrapperClass(null, null))
    init {
        getAllCameras()
        getAllRooms()
    }

    private fun getAllCameras() {
        viewModelScope.launch {
            dataCamera.value = repo.getCameraData()
        }
    }

    private fun getAllRooms() {
        viewModelScope.launch {
            dataRoom.value = repo.getRoomData()
        }
    }

}