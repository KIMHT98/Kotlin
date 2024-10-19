package com.example.androidlab

fun main() {
    val data1 = 10;
    var data2 = 10;

//    data1 = 20; 에러 발생
    val data: Int = 10;
    val data3 = 10; //data3에 대입한 값이 10이므로
                    //타입을 명시하지 않아도 자동으로 인식
//    val data5: Int에러
    val data5:Int = 10;
    someFunc()
}
fun someFunc(){
    val data4: Int
    //println("data4 : $data4")에러 발생
    data4 = 10
    println("data4 : $data4")
}
class KHT {
//    val age: Int 에러
    val age: Int = 26
}
