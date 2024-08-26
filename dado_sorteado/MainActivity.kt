package com.example.dado_aleatorio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicialize os elementos da interface dentro do onCreate
        val imgDice: ImageView = findViewById(R.id.imgDice)
        val btnRoll: Button = findViewById(R.id.btnRoll)

        // Configure o listener para o botão
        btnRoll.setOnClickListener {
            val num = Random.nextInt(1, 7) // Gera um número aleatório entre 1 e 6
            when (num) {
                1 -> imgDice.setImageResource(R.drawable.dice_1)
                2 -> imgDice.setImageResource(R.drawable.dice_2)
                3 -> imgDice.setImageResource(R.drawable.dice_3)
                4 -> imgDice.setImageResource(R.drawable.dice_4)
                5 -> imgDice.setImageResource(R.drawable.dice_5)
                6 -> imgDice.setImageResource(R.drawable.dice_6)
            }
        }
    }
}
