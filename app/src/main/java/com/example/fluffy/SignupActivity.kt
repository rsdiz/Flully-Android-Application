package com.example.fluffy

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        // Inisialisasi komponen dari layout
        val buttonSignup = findViewById<Button>(R.id.buttonSignup)
        /*
        Aksi ketika button signup di klik,
        maka pindah activity ke Dashboard
        */
        buttonSignup.setOnClickListener {
            val intentDashboard = Intent(this, DashboardActivity::class.java)
            startActivity(intentDashboard)
        }
    }
}
