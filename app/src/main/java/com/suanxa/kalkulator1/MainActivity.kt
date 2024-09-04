package com.suanxa.kalkulator1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var input1 : EditText
    private lateinit var input2 : EditText
    private lateinit var buttonkali : Button
    private lateinit var buttonBagi : Button
    private lateinit var buttonTambah: Button
    private lateinit var buttonKurang : Button
    private lateinit var txtHasil : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        input1 = findViewById(R.id.input1)
        input2 = findViewById(R.id.input2)
        buttonkali = findViewById(R.id.buttonKali)
        buttonBagi = findViewById(R.id.buttonBagi)
        buttonTambah = findViewById(R.id.buttonTambah)
        buttonKurang = findViewById(R.id.buttonKurang)
        txtHasil = findViewById(R.id.txtHasil)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        buttonkali.setOnClickListener {
            val angka1 = input1.text.toString().toInt()
            val angka2 = input2.text.toString().toInt()

            val hasil = angka1 * angka2
            txtHasil.text = "Hasil Kali = " + hasil

        }
        buttonBagi.setOnClickListener {
            val angka1 = input1.text.toString().toInt()
            val angka2 = input2.text.toString().toInt()

            val hasil = angka1 / angka2
            txtHasil.text = "Hasil Bagi = " + hasil

        }
        buttonTambah.setOnClickListener {
            val angka1 = input1.text.toString().toInt()
            val angka2 = input2.text.toString().toInt()

            val hasil = angka1 + angka2
            txtHasil.text = "Hasil Tambah = " + hasil

        }
        buttonKurang.setOnClickListener {
            val angka1 = input1.text.toString().toInt()
            val angka2 = input2.text.toString().toInt()

            val hasil = angka1 - angka2
            txtHasil.text = "Hasil Kurang = " + hasil

        }

    }
}