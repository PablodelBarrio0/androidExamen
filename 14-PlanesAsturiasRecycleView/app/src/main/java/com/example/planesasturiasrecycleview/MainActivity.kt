package com.example.planesasturiasrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.planesasturiasrecycleview.adapter.PlanesRecyclerAdapter
import com.example.planesasturiasrecycleview.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvPlanes:RecyclerView=findViewById(R.id.planesRecyclerView)
        val dataSet=DataSource.listPlanes
        rvPlanes.adapter=PlanesRecyclerAdapter(dataSet)
    }
}