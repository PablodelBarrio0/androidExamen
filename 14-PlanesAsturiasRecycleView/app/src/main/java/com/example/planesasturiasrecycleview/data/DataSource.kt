package com.example.planesasturiasrecycleview.data

import com.example.planesasturiasrecycleview.R
import com.example.planesasturiasrecycleview.model.PlanAsturias

class DataSource {
    companion object {
        val listPlanes= listOf<PlanAsturias>(
            PlanAsturias(R.drawable.cultura, "Los mejores espacios culturales") ,
            PlanAsturias(R.drawable.deportes, "Todos los deportes a tu alcence"),
            PlanAsturias(R.drawable.gastronomia, "Los manjares mas deliciosos"),
            PlanAsturias(R.drawable.infantil, "Planes para los peques"),
            PlanAsturias(R.drawable.mascotas, "Espacios reservados para las mascotas"),
            PlanAsturias(R.drawable.montanya, "Sumergete en el verde mas intenso"),
            PlanAsturias(R.drawable.playa, "Las mejores playas nudistas"),
            PlanAsturias(R.drawable.pueblos, "Villas para no volver"),
            PlanAsturias(R.drawable.restauracion, "Las mejores banquetas y butacas restauradas")
        )
    }
}