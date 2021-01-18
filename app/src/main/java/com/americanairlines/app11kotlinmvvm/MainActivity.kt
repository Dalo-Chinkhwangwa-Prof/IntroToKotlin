package com.americanairlines.app11kotlinmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.americanairlines.app11kotlinmvvm.StaticExample.Companion.capitalizeString
import com.americanairlines.app11kotlinmvvm.StaticExample.Companion.staticMethodExample

//class MainActivity extends AppCompatActivity implements Example
class MainActivity : AppCompatActivity(), Example {

    //(LATEINIT) letting the compiler know that this variable will be initialized before first use.
    //Will cause a lateinit property not initialized exception at runtime if we try to use it
    //before initializing it
    lateinit var name: String

    private var name2: String? = null

    private lateinit var tvMain: TextView

    private val constantName: String = ""
    private val constantAge: Int = 2
    private val constantSalary: Double = 2.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvMain = findViewById(R.id.main_textview)
        firstPrint()
        val personJava = PersonJava("Dalo", 6.0, 193.0)
        personJava.name = "" //Setter
        personJava.name //Getter

        val personKotlin  = PersonKotlin("Dalo", 6.0, 193.0)
        personKotlin.name //Getter, no setter because we set val's

        val testSet: MutableSet<PersonKotlin> = mutableSetOf(personKotlin)
        testSet.add(personKotlin)
        testSet.add(personKotlin)

        Log.d("TAG_X", "setSize == ${testSet.size}")
        val i = 0

        Log.d("TAG_X", "$i")

        /*
        Java:
        if(name2 == null){

        }*/
        printName2()
        name2 = "Chinkhwangwa"
        printName2()
    }

    private fun printName2() {
        name2?.let { text ->
            tvMain.text = text
            Log.d("TAG_X", "name2 is $text")
            Log.d("TAG_X", "name2 is ${capitalizeString(text)}")
        } ?: {
            Log.d("TAG_X", "IT IS NULL")
        }()
    }

    override fun firstPrint() {
        staticMethodExample()
        capitalizeString("dalo")
    }

}

interface Example {
    fun firstPrint()
}











