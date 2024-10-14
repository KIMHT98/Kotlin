package com.example.androidlab

class User2{
    constructor(name:String){
        println("constructor(name:String) call..")
    }
    constructor(name:String, count:Int){
        println("consturctor(name, count) call ...")
    }
}
class User3(name:String){

    constructor(name:String, count:Int):this(name){
        println("consturctor(name, count) call ...")
    }
    constructor(name:String, count:Int, email:String):this(name,count){
        println("constructor(name,count,email) call...")
    }

}
fun main() {
//    val user1 = User3("kht",26)
    val user2 = User3("kht",26,"kht19684@gmail.com")
}