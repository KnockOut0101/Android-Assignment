package com.example.displaytextapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

const val MESSAGE_ID = "Text_entered"
class MainActivity : AppCompatActivity()
{

    private lateinit var Enter_Text : EditText
    private lateinit var Send_Button : Button

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Enter_Text = findViewById<EditText>(R.id.enteredText)
        Send_Button = findViewById<Button>(R.id.sendBtn)
    }

    fun sendBtnClickEvent(v: View)
    {
        var Text_Entered = Enter_Text.text.toString()
        val Start_Intent = Intent(this, DisplayMsgActivity::class.java)
        Start_Intent.putExtra(MESSAGE_ID, Text_Entered)
        startActivity(Start_Intent)
    }
}