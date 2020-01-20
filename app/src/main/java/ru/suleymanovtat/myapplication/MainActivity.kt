package ru.suleymanovtat.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvCustom.setTitle(getString(R.string.kino), "next")
        tvCustom.setOnClickListener {
            Toast.makeText(this, "Click", Toast.LENGTH_LONG).show()
        }
    }
}
