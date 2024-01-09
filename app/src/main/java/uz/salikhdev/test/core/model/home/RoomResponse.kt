package uz.salikhdev.test.core.model.home


import com.google.gson.annotations.SerializedName

data class RoomResponse(
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("success")
    val success: Boolean // true
)