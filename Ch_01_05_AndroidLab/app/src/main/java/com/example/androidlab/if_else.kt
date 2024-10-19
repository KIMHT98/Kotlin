package com.example.androidlab

fun main() {
    var data = 10
    if(data>10){
        println("data>0")
    }else if(data>0){
        println("data > 0 && data <= 10")
    } else{
        println("data<=0")
    }
    val result = if(data>0){
        println("data>0")
        true
    }else{
        println("data <= 0")
        false
    }
    println(result)
}