package com.example.player.modules

import com.example.player.MusicListViewModel
import com.example.player.Repository
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { MusicListViewModel() }
    single { Repository() }
}