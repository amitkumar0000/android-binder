package com.android.binder.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.android.binder.R

class CaptureActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_capture)

        setResult(200)
    }

    fun onClick(v:View){
        setResult(200)
        finish()
    }

}
