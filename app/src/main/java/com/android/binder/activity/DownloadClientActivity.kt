package com.android.binder.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Message
import android.os.Messenger
import android.util.Log
import android.view.View
import com.android.binder.R

class DownloadClientActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_download_client)
    }

    fun onClick(v: View){
        when(v.id){
            R.id.Messenger -> {
                var intent = Intent()

                intent.action = "com.android.binder.messengerdemo"

                intent.`package` = "com.android.binder"

                var message = Messenger(ClientHandler(this));

                intent.putExtra("callback-messenger",message)
                startService(intent)


            }
        }
    }

    class ClientHandler(clientRef: DownloadClientActivity):Handler(){


        override fun handleMessage(msg: Message?) {
            var bundler = msg?.data
            Log.d("TAG","Message Received from messanger")


        }

    }
}
