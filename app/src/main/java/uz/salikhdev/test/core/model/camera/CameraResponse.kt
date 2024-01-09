package uz.salikhdev.test.core.model.camera


import com.google.gson.annotations.SerializedName

data class CameraResponse(
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("success")
    val success: Boolean // true
)