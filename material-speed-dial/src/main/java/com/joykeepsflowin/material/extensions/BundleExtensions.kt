package com.joykeepsflowin.material.extensions

import android.content.Context
import android.os.Bundle
import android.os.Parcelable

fun <T : Parcelable> Bundle.getParcelableSafe(context: Context, key: String?): T? {
    classLoader = context.applicationContext.classLoader
    return getParcelable(key)
}