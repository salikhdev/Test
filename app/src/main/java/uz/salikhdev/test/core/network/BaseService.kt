package uz.salikhdev.test.core.network

import retrofit2.Response
import retrofit2.http.GET
import uz.salikhdev.test.core.model.camera.CameraResponse
import uz.salikhdev.test.core.model.home.RoomResponse
import uz.salikhdev.test.core.util.Constants
import javax.inject.Singleton

@Singleton
interface BaseService {

    @GET(Constants.CAMERA_ENDPOINT)
    suspend fun getAllCameras(): Response<CameraResponse?>

    @GET(Constants.ROOM_ENDPOINT)
    suspend fun getAllRooms(): Response<RoomResponse?>
}