package com.android.binder.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.android.binder.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun onClick(v: View){
        when(v.id){
            R.id.button -> activityStart()
        }
    }

    fun activityStart(){
        var intent = Intent(this, CaptureActivity::class.java)
        startActivityForResult(intent,200)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        when(requestCode){
            200 -> {
                println("Received the Activity Result $resultCode")
                Log.d("TAG","Received the Activity Result $resultCode")
            }

            else -> {
                println("Result Code does not match")
                Log.d("TAG","Result Code does not match")
            }
        }
    }
}
