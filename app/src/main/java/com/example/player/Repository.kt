package com.example.player

class Repository {

    fun getListMusic() : ArrayList<Model>{
        val listMusic : ArrayList<Model> = ArrayList()
        listMusic.add(Model("Jazz in the night"))
        listMusic.add(Model("Tone poem"))
        listMusic.add(Model("Jazz in the night"))
        listMusic.add(Model("Jazz in the night"))
        listMusic.add(Model("Tone poem"))
        listMusic.add(Model("Jazz in the night"))
        listMusic.add(Model("Jazz in the night"))
        listMusic.add(Model("Tone poem"))
        listMusic.add(Model("Jazz in the night"))
        listMusic.add(Model("Jazz in the night"))
        listMusic.add(Model("Tone poem"))
        listMusic.add(Model("Jazz in the night"))
        return listMusic
    }

}