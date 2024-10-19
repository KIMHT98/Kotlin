package com.example.androidlab

fun main() {
    var sum:Int = 0;
    for(i in 1..10){
  //for(i in 1 until 10) 1~9
  //for(i in 2..10 step 2) 2~10 2씩 증가
  //for(i in 10 downTo 1) 10 ~ 1
        sum+=i
    }
    println(sum)//55
    var data = arrayOf<Int>(10,20,30)
    for(i in data.indices){
        print(data[i])
        if(i !== data.size-1)print(",")
    }
    for((index,value) in data.withIndex()){
        print(value)
        if(index !== data.size-1)print(",")
    }
    var x = 0;
    var sum1 = 0;
    while(x<10){
        sum1+=++x
    }
    println(sum1)//55
}