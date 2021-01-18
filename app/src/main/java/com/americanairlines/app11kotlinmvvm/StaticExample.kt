package com.americanairlines.app11kotlinmvvm

import android.util.Log
import java.util.*

class StaticExample {

    //Creating static variables in Kotlin
    companion object{ //OR @JVMStatic annotation
        val API_KEY = "1111111111111111"

        fun staticMethodExample(){
            Log.d("TAG_X", "Called a static method...")
        }

        fun capitalizeString(input: String): String {
            return input.toUpperCase(Locale.US)
        }

        fun capitalizeStringII(input: String): String = input.toUpperCase(Locale.US)

    }
}