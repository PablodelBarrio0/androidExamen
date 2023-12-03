package com.example.mensajesrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val messages = listOf(
            Message("Ana", R.drawable.img1,"¡Hola a todos! ¿Cómo estáis hoy?"),
            Message("Carlos", R.drawable.img2,"Hola Ana, estoy un poco cansado, pero bien. ¿Y tú?"),
            Message("Juan", R.drawable.img3,"Yo pienso ir al cine, hay una película que quiero ver."),
            Message("Luis", R.drawable.img4,"¡Vamos todos juntos! ¿Qué les parece el sábado por la tarde?"),
            Message("Sofía", R.drawable.img5,"Me encantaría, pero tengo un compromiso, ¿qué tal el domingo?"),
            Message("Ana", R.drawable.img1,"El domingo me viene mejor también, podríamos ir a tomar un café después."),
            Message("Luis", R.drawable.img4,"¡Perfecto! ¿Conocéis algún lugar nuevo que hayan abierto?"),
            Message("Celia", R.drawable.img6,"Sí, cerca de mi casa abrieron una cafetería genial."),
            Message("Celia", R.drawable.img6," ¡Entonces quedamos el domingo allí! No veo la hora de vernos."),
            Message("Ana", R.drawable.img1,"Y qué pelí vemos?"),
            Message("Sofía", R.drawable.img5,"Me gustaría ver la última de Disney"),
            Message("Juan", R.drawable.img3,"Sí! Tiene buena pinta. Pues quedamos así. Vamos hablando, chic@s"),
            Message("Luis", R.drawable.img4,"Perfecto!"),
        )
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val adapter = MessageAdapter(messages)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}