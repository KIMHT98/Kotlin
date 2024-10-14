package com.example.androidlab

fun main() {

    fun some(data1: Int, data2: Int = 10):Int{
        return data1*data2;
    }
    println(some(10))//100
    println(some(10,20))//200

    fun some2(data1:Int, data2:Int):Int{
        return data1 * data2
    }
    println(some2(10,20))//200
    println(some2(data2=100, data1=10))//1000
}
