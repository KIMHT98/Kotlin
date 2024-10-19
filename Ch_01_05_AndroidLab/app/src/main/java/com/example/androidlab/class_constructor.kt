package com.example.androidlab

class Member{
    var name = "kim"
    constructor(name:String){
        this.name = name
    }
    fun someFun(){
        println("name : $name")
    }
    class SomeClass{}
}
//class User consturctor(){} 주 생성자 선언
//class User(){} 키워드 생략
//class User{} 매개변수가 없는 주 생성자 자동 선언
//class User(name: String, count:Int){} 매개변수
// val user = User("kim",26)//매개변수가 있는 생성자 호출
//class User(name:String, count:Int){
//    //클래스 멤버 변수 선언
//    var name: String
//    var count : Int
//    init{
//        //클래스 멤버 변수에 생성자 매개변수값 대입
//        this.name = name
//        this.count = count
//        println("i am init")
//    }
//    fun someFun(){
//        println("name: $name, count: $count")
//    }
//}
class User(val name:String, val count:Int){
    //클래스 멤버 변수 선언
    fun someFun(){
        println("name: $name, count: $count")
    }
}
fun main() {
    val member = Member("hyeontae")
    member.someFun()
    val user = User("kim",26)
    user.someFun()
}