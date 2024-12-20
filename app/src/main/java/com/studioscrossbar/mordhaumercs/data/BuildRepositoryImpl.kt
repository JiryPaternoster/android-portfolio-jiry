package com.studioscrossbar.mordhaumercs.data

import com.studioscrossbar.mordhaumercs.network.api.ApiClient

class BuildRepositoryImpl(private val apiClient : ApiClient) : BuildRepository {

    override suspend fun getBuildsByPage(page: Int): List<BuildListItem> {
        return apiClient.apiService.getBuildsByPage(page)
    }

    override suspend fun getBuildById(buildId: Int): Build {
        return apiClient.apiService.getBuildById(buildId)
    }
}