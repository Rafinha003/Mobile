package com.example.navegacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.example.navegacao.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEnviar.setOnClickListener {
            val texto = binding.txtInformacao.text.toString() // Captura o texto escrito

            // Abrir o SecondActivity
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("texto", texto)
            startActivity(intent)
        }
    }
}
