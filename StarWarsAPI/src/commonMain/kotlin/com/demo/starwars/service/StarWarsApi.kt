package com.demo.starwars.service

import com.demo.starwars.model.PeopleResult
import io.ktor.client.HttpClient
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.*
//import io.ktor.client.features.json.serializer.KotlinxSerializer
import io.ktor.client.request.*
import kotlinx.serialization.json.Json

class StarWarsApi {
    private val httpClient = HttpClient {
//        install(JsonFeature) {
//            val json = Json {
//                ignoreUnknownKeys = true
//                useAlternativeNames = false
//            }
//            serializer = KotlinxSerializer(json)
//        }
        install(ContentNegotiation) {
            json(Json {
                prettyPrint = true
                isLenient = true
                ignoreUnknownKeys = true
                useAlternativeNames = false
            })
        }
    }

    companion object {
        private const val BASE_URL = "https://swapi.dev/api/"
    }

    suspend fun getAllCharacters(): PeopleResult {
        return httpClient.get(BASE_URL + "people").body()
    }
}