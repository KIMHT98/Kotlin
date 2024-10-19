package com.example.androidlab

fun main() {
    val arr1: Array<Int> = Array(3,{0})
    arr1[0] = 10
    arr1[1] = 20
    arr1.set(2,30)
    println(
        """
    array size : ${arr1.size}
    array data : ${arr1[0]}, ${arr1[1]}, ${arr1.get(2)}
    """
    )
    val arr2: IntArray = IntArray(3,{0})
    val arr3: BooleanArray = BooleanArray(3,{false})

    val arr4 = arrayOf<Int>(10,20,30)
    println(
        """
    array size : ${arr2.size}
    array data : ${arr2[0]}, ${arr2[1]}, ${arr2.get(2)}
    """
    )
    println(
        """
    array size : ${arr3.size}
    array data : ${arr3[0]}, ${arr3[1]}, ${arr3.get(2)}
    """
    )
    println(
        """
    array size : ${arr4.size}
    array data : ${arr4[0]}, ${arr4[1]}, ${arr4.get(2)}
    """
    )
    val arr5 = intArrayOf(10,20,30)
    val arr6 = booleanArrayOf(true,true,false)

    val list = listOf<Int>(10,20,30)
    println(
        """
    list size : ${list.size}
    list data : ${list[0]}, ${list[1]}, ${list.get(2)}
    """
    )
    var mutableList = mutableListOf<Int>(10,20,30)
    mutableList.add(3,40)
    mutableList.set(0,50)
    println(
        """
    list size : ${mutableList.size}
    list data : ${mutableList[0]}, ${mutableList[1]}, ${mutableList.get(2)}, ${mutableList.get(3)}
    """
    )

    var map = mapOf<String,String>(Pair("one","hello"),"two" to "world")
    println(
        """
    map size : ${map.size}
    map data : ${map.get("one")}, ${map.get("two")}
    """
    )
}