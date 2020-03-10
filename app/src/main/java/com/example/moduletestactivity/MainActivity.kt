package com.example.moduletestactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.qwmodule.GWInitialActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvClick.setOnClickListener {
            val intent = Intent(this, GWInitialActivity::class.java)
            startActivity(intent)
        }

    }
}
