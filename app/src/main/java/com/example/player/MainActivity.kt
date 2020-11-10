package com.example.player

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.player.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        val musicListViewModel: MusicListViewModel by inject()

        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        val binding : ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = musicListViewModel.adapter

    }
}