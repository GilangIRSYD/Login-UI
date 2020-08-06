package com.catatancodingku.loginui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        button.setOnClickListener {

            val username = edUsername.text.toString()
            val password = edPassword.text.toString()

            if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)){
                Toast.makeText(this, "Masukkan Username dan Password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (username == "udacoding"){
                if (password == "uda123"){
                    startActivity(Intent(this,SuksesLogin::class.java))
                }else{
                    Toast.makeText(this, "Password Salah", Toast.LENGTH_SHORT).show()
                }

            }else{
                Toast.makeText(this, "Username Salah", Toast.LENGTH_SHORT).show()
            }
        }
    }
}