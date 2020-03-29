package com.example.calculator

import android.app.Activity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun operation(view: View) {
        val number1 = bil1.text.toString().toDouble()
        val number2 = bil2.text.toString().toDouble()
        var result = 0.0

        when (view.tag) {
            "tambah" -> {
                result = number1 + number2
            }
            "kurang" -> {
                result = number1 - number2
            }
            "kali" -> {
                result = number1 * number2
            }
            "bagi" -> {
                result = number1 / number2
            }
        }

        hasil.text = result.toString()
    }
}