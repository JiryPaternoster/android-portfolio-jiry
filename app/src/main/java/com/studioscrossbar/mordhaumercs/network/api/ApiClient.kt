package com.studioscrossbar.mordhaumercs.network.api

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

class RetrofitClient
(
    private val baseUrl : String = "https://mordhaumercs-backend.onrender.com/api/"
)
{
    // HAAL LATER UIT EEN OF ANDERE CONFIG FILE


    val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
            .build()
    }
}


interface ApiClient {
    val apiService : ApiService
}

class ApiClientImpl : ApiClient {
    override val apiService : ApiService by lazy {
        RetrofitClient().retrofit.create(ApiService::class.java)
    }
}