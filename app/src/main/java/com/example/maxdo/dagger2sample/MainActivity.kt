package com.example.maxdo.dagger2sample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.maxdo.dagger2sample.dagger.simpleInject.DaggerSimpleInjectComponent
import com.example.maxdo.dagger2sample.dagger.simpleInject.SimpleModule
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val box = DaggerSimpleInjectComponent.builder().build().box
    val boxCalc = DaggerSimpleInjectComponent.builder().build().boxCalc
//    val boxCalc = DaggerSimpleInjectComponent.builder().build().boxCalc
    val mod = DaggerSimpleInjectComponent.builder().simpleModule( SimpleModule()).build()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        tv1.text = box.toString()
//        tv1.text = boxCalc.calc().toString()

//        tv1.text = calc().toString()

        val c = Coroutines()
    }
}
