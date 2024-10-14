package com.example.androidlab

//fun main() {
//    var data:String? = null
//    var length = if(data == null){
//        0
//    }else{
//        data.length
//    }
//    println("data length : $length")//0
//}
fun main() {
    var data: String? = null
    println("data length : ${data?.length ?:0}")
}