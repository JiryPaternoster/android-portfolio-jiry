package com.studioscrossbar.mordhaumercs.network.api

import com.studioscrossbar.mordhaumercs.data.BuildListItem
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("build/page/{pageNr}")
    suspend fun getBuildsByPage(@Path("pageNr") pageNr : Int) : List<BuildListItem>
}