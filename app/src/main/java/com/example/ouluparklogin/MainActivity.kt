package com.example.ouluparklogin

import Sql.DBHelper
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    var login: Button? = null
    var reg: Button? = null
    var toolbar: Toolbar? = null
    var dbHelper: DBHelper? = null
    override fun onBackPressed() {
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dbHelper = DBHelper(this)
        login = findViewById<View>(R.id.btnLogin) as Button
        toolbar = findViewById<View>(R.id.tool_main) as Toolbar
        login!!.setOnClickListener { view: View? ->
            val intent = Intent(this@MainActivity, Login::class.java)
            startActivity(intent)
        }
        reg = findViewById(R.id.btnSignUp)
        reg?.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, SignUp::class.java)
            startActivity(intent)
        })
    }
}