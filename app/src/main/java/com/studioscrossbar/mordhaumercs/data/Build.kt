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
    val id : Int,
    val userId : Int,
    val title : String,
    val configLines : String,
    val description: String,
    val imageLocation: String
)
