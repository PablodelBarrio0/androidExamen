package com.example.planesasturiasrecycleview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.planesasturiasrecycleview.R
import com.example.planesasturiasrecycleview.model.PlanAsturias

class PlanesRecyclerAdapter(val planesDataSet:List<PlanAsturias>): RecyclerView.Adapter<PlanesRecyclerAdapter.PlanesViewHolder>() {
    class PlanesViewHolder(view: View):RecyclerView.ViewHolder(view){
        val imgPlan : ImageView = view.findViewById(R.id.imgPlan)
        val txtSlogan : TextView = view.findViewById(R.id.txtSlogan)

        fun vincular(item: PlanAsturias){
            imgPlan.setImageResource(item.imgResourceId)
            txtSlogan.text=item.descripcion
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanesViewHolder {
        val inflador=LayoutInflater.from(parent.context)
        val vistaInflada : View = inflador.inflate(R.layout.item_plan_asturias, parent, false)
        return PlanesViewHolder(vistaInflada)
    }

    override fun getItemCount() = planesDataSet.size

    override fun onBindViewHolder(holder: PlanesViewHolder, position: Int) {
        holder.vincular(planesDataSet[position])
    }

}