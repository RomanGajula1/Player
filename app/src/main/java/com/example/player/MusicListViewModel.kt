package com.example.player

import androidx.lifecycle.ViewModel
import org.koin.core.KoinComponent
import org.koin.core.inject

class MusicListViewModel : ViewModel(), KoinComponent {
    private val repository: Repository by inject()
    val adapter: Adapter = Adapter(null)
    init {
        adapter.list = repository.getListMusic()
        adapter.notifyDataSetChanged()
    }
}