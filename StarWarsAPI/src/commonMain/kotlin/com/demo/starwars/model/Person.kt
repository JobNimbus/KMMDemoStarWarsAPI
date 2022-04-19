package com.demo.starwars.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Person(
    @SerialName("name")
    val name: String,
    @SerialName("height")
    val height: String,
    @SerialName("eye_color")
    val eyeColor: String
)

@Serializable
data class PeopleResult(
    @SerialName("results")
    val people: List<Person>,
    @SerialName("count")
    val count: Int
)



