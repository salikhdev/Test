package uz.salikhdev.test.core.repository

import android.util.Log
import uz.salikhdev.test.core.model.camera.CameraResponse
import uz.salikhdev.test.core.model.home.RoomResponse
import uz.salikhdev.test.core.network.BaseService
import uz.salikhdev.test.core.util.WrapperClass
import javax.inject.Inject

class BaseRepository @Inject constructor(
    private val service: BaseService
) {

    private val dataOfCamera = WrapperClass<CameraResponse?, Exception>()
    private val dataOfRoom = WrapperClass<RoomResponse?, Exception>()

    suspend fun getCameraData(): WrapperClass<CameraResponse?, Exception> {
        try {
            dataOfCamera.data = service.getAllCameras().body()

        } catch (e: Exception) {
        }
        return dataOfCamera
    }

    suspend fun getRoomData(): WrapperClass<RoomResponse?, Exception> {
        try {
            dataOfRoom.data = service.getAllRooms().body()
        } catch (e: Exception) {
        }
        return dataOfRoom
    }


}