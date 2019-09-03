package com.clairedl.scala

case class Item(val name: String, val quantity: String)

case class Quantity(number: Int, whatUnit: String)

class Cart(
    val shopper: String,
    val content: List[Item]
    )
