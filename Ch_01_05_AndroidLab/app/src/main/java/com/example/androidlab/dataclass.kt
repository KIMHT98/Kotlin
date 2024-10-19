package com.example.androidlab
class NonDataClass(val name: String, val email: String, val age:Int)
data class DataClass(val name: String, val email: String, val age: Int){
    lateinit var address:String
    constructor(name:String, email: String, age: Int, address: String):this(name,email,age){
        this.address = address
    }
}

fun main() {
    val non1 = NonDataClass("a","b",10)
    val non2 = NonDataClass("a","b",10)

    val data1 = DataClass("a","b",10)
    val data2 = DataClass("a","b",10)

    val obj1 = DataClass("a","b",10,"seoul")
    val obj2 = DataClass("a","b",10,"busan")

    println("non data class equals : ${non1.equals(non2)}")
    println("data class equals : ${data1.equals(data2)}")
    println("obj equals : ${obj1.equals(obj2)}")

}
