package com.android.binder.services

import android.app.IntentService
import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.os.Message
import android.os.Messenger

class MessengerDemoService:IntentService("myIntentService"){
    override fun onHandleIntent(intent: Intent?) {

        var messenger = intent?.getParcelableExtra<Messenger>("callback-messenger")

        var msg = Message.obtain()

        msg.what = 0

        messenger?.send(msg)

    }

}