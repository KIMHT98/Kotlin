package com.example.androidlab

//open class Super(name:String){
//
//}
//class Sub(name:String):Super(name){
//
//}
//class Sub:Super{
//    constructor(name:String):super(name){
//
//    }
//}
open class Super{
    var superData = 10
    open var someData = 10
    fun superFun(){
        println("i am superFun : $superData")
    }
    open fun someFun(){
        println("i am super class function : $someData")
    }
}
class Sub: Super(){
    override  var someData = 20
    override fun someFun(){
        println("i am sub class function : $someData")
    }
}

fun main() {
    val obj = Sub()
    obj.superData = 20
    obj.superFun()
    obj.someFun()
}