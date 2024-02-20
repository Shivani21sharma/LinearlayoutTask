package com.shivani.linearlayouttask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var etName: EditText
    lateinit var etCollege: EditText
    lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etName = findViewById(R.id.etname)
        etCollege = findViewById(R.id.etCollege)
        btnLogin = findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener {
            if (etName.text.isEmpty()){
                etName.error="Enter Name"
            }else if(etCollege.text.isEmpty()){
                etCollege.error="Enter College"
            }else{
                System.out.println("Login")
            }
        }
    }
}