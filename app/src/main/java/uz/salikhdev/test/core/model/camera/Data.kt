package uz.salikhdev.test.core.model.camera


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("cameras")
    val cameras: List<Camera>,
    @SerializedName("room")
    val room: List<String>
)