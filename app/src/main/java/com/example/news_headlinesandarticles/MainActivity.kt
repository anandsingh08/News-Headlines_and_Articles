package com.example.news_headlinesandarticles

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.browser.customtabs.CustomTabsIntent
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONObject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val button1=findViewById<Button>(R.id.business)
       button1.setOnClickListener{
            val intent=Intent(this,Business::class.java)
            startActivity(intent)
        }
        val button2=findViewById<Button>(R.id.entertainment)
        button2.setOnClickListener{
            val intent=Intent(this,Entertainment::class.java)
            startActivity(intent)
        }
        val button3=findViewById<Button>(R.id.everything)
        button3.setOnClickListener{
            val intent=Intent(this,Everything::class.java)
            startActivity(intent)
        }
        val button4=findViewById<Button>(R.id.general)
        button4.setOnClickListener{
            val intent=Intent(this,General::class.java)
            startActivity(intent)
        }
        val button5=findViewById<Button>(R.id.health)
        button5.setOnClickListener{
            val intent=Intent(this,Health::class.java)
            startActivity(intent)
        }
        val button6=findViewById<Button>(R.id.science)
        button6.setOnClickListener{
            val intent=Intent(this,Science::class.java)
            startActivity(intent)
        }
        val button7=findViewById<Button>(R.id.sports)
        button7.setOnClickListener{
            val intent=Intent(this,Sports::class.java)
            startActivity(intent)
        }
        val button8=findViewById<Button>(R.id.technology)
        button8.setOnClickListener{
            val intent=Intent(this,Technology::class.java)
            startActivity(intent)
        }



    }
}
