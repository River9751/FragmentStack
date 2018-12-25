package com.example.river.fragmentstack

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

object Singleton {
    var objectMember = 0
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            Global.count++
            println("*** ------------------------------------")
            val fm = supportFragmentManager
            val trans = fm.beginTransaction()
            trans.replace(R.id.container, F1(),"tag")
            trans.commit()
        }

        btnBack.setOnClickListener {
            Global.count++
            println("*** -----------addToBackStack-----------")
            val fm = supportFragmentManager
            val trans = fm.beginTransaction()
            trans.replace(R.id.container, F1(), "tag").addToBackStack(null)
            trans.commit()
        }
    }

    override fun onBackPressed() {
        println("*** ---------------BackPressed---------------")
        super.onBackPressed()
    }
}


object Global {
    var count = 0
}