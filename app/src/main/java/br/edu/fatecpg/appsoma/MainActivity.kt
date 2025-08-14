package br.edu.fatecpg.appsoma

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import br.edu.fatecpg.appsoma.R.id.btn_divs




class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val edtNum1 = findViewById<EditText>(R.id.edt_num1)
        val edtNum2 = findViewById<EditText>(R.id.edt_num2)
        val btnSoma = findViewById<Button>(R.id.btn_soma)
        val btnDivs = findViewById<Button>(btn_divs)
        val btnSubtra = findViewById<Button>(R.id.btn_subtra)
        val btnMulti = findViewById<Button>(R.id.btn_multi)
        val txvResultado = findViewById<TextView>(R.id.txv_resultado)

        btnSoma.setOnClickListener{
            val valor1 = edtNum1.text.toString().toInt()
            val valor2 = edtNum2.text.toString().toInt()
            val resultado = valor1+valor2
            txvResultado.text = "O Resultado é: $resultado"
        }

        btnDivs.setOnClickListener{
            val valor1 = edtNum1.text.toString().toInt()
            val valor2 = edtNum2.text.toString().toInt()
            val resultado = valor1/valor2
            txvResultado.text = "O Resultado é: $resultado"
        }

        btnSubtra.setOnClickListener{
            val valor1 = edtNum1.text.toString().toInt()
            val valor2 = edtNum2.text.toString().toInt()
            val resultado = valor1-valor2
            txvResultado.text = "O Resultado é: $resultado"
        }

        btnMulti.setOnClickListener{
            val valor1 = edtNum1.text.toString().toInt()
            val valor2 = edtNum2.text.toString().toInt()
            val resultado = valor1*valor2
            txvResultado.text = "O Resultado é: $resultado"
        }

    }
}