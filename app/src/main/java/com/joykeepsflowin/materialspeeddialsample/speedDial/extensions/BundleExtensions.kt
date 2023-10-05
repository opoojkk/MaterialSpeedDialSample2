package com.joykeepsflowin.materialspeeddialsample.speedDial.extensions

import android.os.Bundle
import android.os.Parcelable
import com.joykeepsflowin.materialspeeddialsample.APP

fun <T : Parcelable> Bundle.getParcelableSafe(key: String?): T? {
    classLoader = APP.get().classLoader
    return getParcelable(key)
}