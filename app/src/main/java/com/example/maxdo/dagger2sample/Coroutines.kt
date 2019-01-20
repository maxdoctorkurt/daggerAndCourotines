package com.example.maxdo.dagger2sample

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.lang.Thread.sleep

class Coroutines {

    suspend fun dumb1() {
        delay(1000)
        println("*** dumb1")
    }

    suspend fun dumb2() {
        delay(1000)
        println("*** dumb2")
    }

    init {

        runBlocking { // блочит
//        GlobalScope.launch { // не блочит

            dumb1()
            dumb2()

        }

//        Thread.sleep(1000)

        println("*** stop")


        // map

        // flat map

        // merge

        // concat


        //zip



    }








}