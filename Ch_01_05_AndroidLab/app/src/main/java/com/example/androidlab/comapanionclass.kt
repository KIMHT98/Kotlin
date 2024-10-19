package com.example.androidlab

class MyClass{
    companion object{
        var data = 10
        fun some(){
            println(data)
        }
    }
}

fun main() {
    MyClass.data = 30
    MyClass.some()
}