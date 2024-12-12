package com.studioscrossbar.mordhaumercs.DI

import com.studioscrossbar.mordhaumercs.data.BuildRepository
import com.studioscrossbar.mordhaumercs.data.BuildRepositoryImpl
import com.studioscrossbar.mordhaumercs.network.api.ApiClient
import com.studioscrossbar.mordhaumercs.network.api.ApiClientImpl
import com.studioscrossbar.mordhaumercs.ui.screens.mercbuild.detail.MercBuildDetailViewModel
import com.studioscrossbar.mordhaumercs.ui.screens.mercbuild.overview.MercBuildOverviewViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single<ApiClient> { ApiClientImpl() }
    single<BuildRepository> { BuildRepositoryImpl(get())}

    viewModel {
        MercBuildOverviewViewModel(get())
    }

    viewModel {
        (buildId : Int) ->
        MercBuildDetailViewModel(
            get(),
            buildId = buildId
        )
    }

}
