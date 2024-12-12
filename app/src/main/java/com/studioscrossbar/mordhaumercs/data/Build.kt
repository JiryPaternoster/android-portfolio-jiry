package com.studioscrossbar.mordhaumercs.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BuildListItem(
    @SerialName("build_id") val id : Int,
    @SerialName("user_id") val userId : Int,
    val title : String,
    val username : String,
    @SerialName("image_location") val imageLocation: String
)

@Serializable
data class Build(
    @SerialName("build_id") val id : Int,
    val username : String,
    @SerialName("user_id") val userId : Int,
    val title : String,
    val description: String,
    val configlines : String,
    @SerialName("image_location") val imageLocation: String,
    val categories : List<String>
)
