package uz.salikhdev.test.core.model.camera


import com.google.gson.annotations.SerializedName

data class Camera(
    @SerializedName("favorites")
    val favorites: Boolean, // true
    @SerializedName("id")
    val id: Int, // 1
    @SerializedName("name")
    val name: String, // Camera 1
    @SerializedName("rec")
    val rec: Boolean, // false
    @SerializedName("room")
    val room: String, // FIRST
    @SerializedName("snapshot")
    val snapshot: String // https://serverspace.ru/wp-content/uploads/2019/06/backup-i-snapshot.png
)