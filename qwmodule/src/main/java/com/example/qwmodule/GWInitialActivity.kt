package com.example.qwmodule

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.example.qwmodule.ui.login.LoginActivity
import kotlinx.android.synthetic.main.activity_gwinitial.*

class GWInitialActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gwinitial)
        setSupportActionBar(toolbar)
        fab.setOnClickListener { view ->
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
