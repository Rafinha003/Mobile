package com.example.gorjeta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import java.lang.Math.ceil
import java.text.NumberFormat
import java.util.Locale

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalcular : Button = findViewById(R.id.btnCalcular)
        btnCalcular.setOnClickListener {

            val txtValorConta : EditText = findViewById(R.id.txtValorConta)
            val txtPorcentagemGorjeta : EditText = findViewById(R.id.txtPorcentagemGorjeta)
            val swtArredondar: Switch = findViewById(R.id.swtArredondar)
            val txtValorGorjeta: TextView = findViewById(R.id.txtValorGorjeta)

            val valorConta = txtValorConta.text.toString().toDouble()
            val porcentagemGorjeta = txtPorcentagemGorjeta.text.toString().toDouble()
            var valorGorjeta = valorConta * (porcentagemGorjeta/100)

            if (swtArredondar.isChecked){
                valorGorjeta = ceil(valorGorjeta)
            }

            val brFormatador = NumberFormat.getCurrencyInstance(Locale("pt","BR"))
            txtValorGorjeta.text = "Valor da gorjeta ${brFormatador.format(valorGorjeta)}"

        }

    }
}