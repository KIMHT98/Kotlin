package com.example.androidlab

val data: Int by lazy {
    println("in lazy .........")
    10
    26
}
fun main() {
    println("in main.......")
    println(data + 10)
    println("저는 ${data}살 입니다.")
}