package org.nhta.nhta_kmp1

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.nhta.nhta_kmp1.di.initKoin

class BookApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@BookApplication)
        }
    }
}