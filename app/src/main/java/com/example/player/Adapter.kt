package com.example.player

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class Adapter(var list: ArrayList<Model>?) : RecyclerView.Adapter<Adapter.MyViewHolder>() {

    inner class MyViewHolder(view: View) :RecyclerView.ViewHolder(view){
        val nameMusic: TextView = view.findViewById<View>(R.id.nameMusic) as TextView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemsView: View = LayoutInflater.from(parent.context) // LayoutInflater – это класс, который умеет из содержимого layout-файла создать View-элемент. Метод который это делает называется inflate.
            .inflate(R.layout.item_music, parent, false)
        return MyViewHolder(itemsView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val items: Model = list!![position]
        holder.nameMusic.text = items.name

//        Picasso.get()
//            .load("http://cdn.onlinewebfonts.com/svg/download_41143.png")
//            .into(holder.imagePlay)
    }

    override fun getItemCount(): Int {
        return list!!.size
    }
}