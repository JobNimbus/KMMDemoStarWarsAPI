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
//    @SerialName("launch_year")
//    val launchYear: Int,
//    @SerialName("launch_date_utc")
//    val launchDateUTC: String,
//    @SerialName("rocket")
//    val rocket: Rocket,
//    @SerialName("details")
//    val details: String?,
//    @SerialName("launch_success")
//    val launchSuccess: Boolean?,
//    @SerialName("links")
//    val links: Links
)

