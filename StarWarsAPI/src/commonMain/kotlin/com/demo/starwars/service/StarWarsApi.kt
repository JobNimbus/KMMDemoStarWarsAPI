package com.demo.starwars.service

import com.demo.starwars.model.PeopleResult
import io.ktor.client.HttpClient
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer
import io.ktor.client.request.*
import kotlinx.serialization.json.Json

class StarWarsApi {
    private val httpClient = HttpClient {
        install(JsonFeature) {
            val json = Json { ignoreUnknownKeys = true }
            serializer = KotlinxSerializer(json)
        }
    }

    companion object {
        private const val BASE_URL = "https://swapi.dev/api/"
    }

    suspend fun getAllCharacters(): PeopleResult {
        return httpClient.get(BASE_URL + "people")
    }
}