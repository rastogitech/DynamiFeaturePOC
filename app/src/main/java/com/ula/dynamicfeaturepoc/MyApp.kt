package com.ula.dynamicfeaturepoc

import com.google.android.play.core.splitcompat.SplitCompat
import com.google.android.play.core.splitcompat.SplitCompatApplication

class MyApp : SplitCompatApplication() {

    override fun onCreate() {
        super.onCreate()
        SplitCompat.install(this)
    }
}