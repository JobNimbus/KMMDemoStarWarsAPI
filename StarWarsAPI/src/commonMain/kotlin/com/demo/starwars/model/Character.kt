package com.demo.starwars.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Character(
    @SerialName("name")
    val name: String,
    @SerialName("height")
    val height: String,
    @SerialName("eye_color")
    val eyeColor: String
)

