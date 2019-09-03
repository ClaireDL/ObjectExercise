package com.clairedl.scala

case class Item(val name: String, val quantity: String)

class Cart(
    val shopper: String,
    val content: List[Item]
    )
