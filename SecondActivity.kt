package com.example.navegacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navegacao.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val texto = intent.getStringExtra("texto") // Ensure the key matches
        val resultado = intent.getIntExtra("resultado", 0)
        binding.txtResultado.text = texto + "valor " + resultado
    }
}
