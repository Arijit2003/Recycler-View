package com.example.recyclerview

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.NonDisposableHandle.parent

class MyAdapter(val context: Context, val songsList:ArrayList<song>):RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    lateinit var view:View
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var layoutInflater:LayoutInflater=LayoutInflater.from(context)
        view=layoutInflater.inflate(R.layout.song_item,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.title.text=songsList[position].title
        holder.description.text=songsList[position].description
        var color="#cccccc"
        if(position % 2==0){
            color="#eeeeee"
        }
        holder.linearLayout.setBackgroundColor(Color.parseColor(color))
        view.setOnClickListener(){
            Toast.makeText(context,"${holder.title.text}",Toast.LENGTH_SHORT).show()
        }
        

    }

    override fun getItemCount(): Int {
        return songsList.size
    }
    class MyViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){

        var title: TextView =itemView.findViewById(R.id.title)
        var description:TextView=itemView.findViewById(R.id.description)
        var linearLayout:LinearLayout=itemView.findViewById(R.id.songItem)

    }
}
