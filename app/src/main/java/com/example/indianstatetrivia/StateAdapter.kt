package com.example.indianstatetrivia

import android.content.res.ColorStateList
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StateAdapter (
    val stateList: List<State>
        ):RecyclerView.Adapter<StateAdapter.ViewHolder>(){
    class ViewHolder(val view:View):RecyclerView.ViewHolder(view) {
        private lateinit var txtName:TextView
        fun bind(state: State){
           txtName = view.findViewById(android.R.id.text1)
            txtName.text = state.name
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layout = android.R.layout.simple_list_item_1
        return ViewHolder(LayoutInflater.from(parent.context).inflate(layout,parent,false))
    }

    override fun getItemCount()= stateList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(stateList[position])
    }

}




