package com.studioscrossbar.mordhaumercs.data

interface BuildRepository {

    suspend fun getBuildsByPage(page : Int) : List<BuildListItem>

    suspend fun getBuildById(buildId : Int) : Build

}