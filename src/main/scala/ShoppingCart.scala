package com.clairedl.scala

class Item(val name: String, val quantity: Quantity)

class Quantity(){
    def quantity(howMany: Int): String =
        return s"$howMany"

    def quantity(howMuch: Int, whatUnit: String): String =
        return s"$howMuch $whatUnit"
}

class Cart(
    val shopper: String,
    val content: List[Item]
    )
