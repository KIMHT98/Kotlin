package com.example.androidlab

fun main() {
    var data=10;
    when(data){
        10-> println("data is 10")
        20 -> println("data is 20")
        else ->{
            println("data is not valid data")
        }
    }
    var data1="hello";
    when(data1){
        "hello"-> println("data is hello")
        "world" -> println("data is world")
        else ->{
            println("data is not valid data")
        }
    }
    var data2:Any="hello";
    when(data2){
        is String -> println("data is String")
        "hello"-> println("data is hello")
        20,30 -> println("data is 20 or 30")
        else ->{
            println("data is not valid data")
        }
    }
    var data3=10;
    when{
        data3<=0 -> println("data is String")
        data3>100-> println("data is hello")
        else -> println("data is valid")
        }
    val result = when{
        data3<=0 -> "data is String"
        data3>100-> "data is hello"
        else -> "data is valid"
    }
    println(result)//"data is valid"
    }
