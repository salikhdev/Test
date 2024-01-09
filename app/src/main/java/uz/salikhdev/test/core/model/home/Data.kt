package uz.salikhdev.test.core.model.home


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("favorites")
    val favorites: Boolean, // true
    @SerializedName("id")
    val id: Int, // 1
    @SerializedName("name")
    val name: String, // Door Door
    @SerializedName("room")
    val room: String, // FIRST
    @SerializedName("snapshot")
    val snapshot: String // https://serverspace.ru/wp-content/uploads/2019/06/backup-i-snapshot.png
)