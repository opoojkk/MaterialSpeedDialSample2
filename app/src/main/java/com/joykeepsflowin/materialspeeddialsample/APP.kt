package com.joykeepsflowin.materialspeeddialsample

import android.app.Application

class APP : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        private lateinit var instance: APP

        @JvmStatic
        fun get(): APP {
            return instance
        }
    }
}