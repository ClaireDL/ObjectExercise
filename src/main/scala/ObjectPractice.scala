package com.clairedl.scala

object Main extends App {
    // car exercise
    val newEngine = new Engine("bmw", "whatever")
    val peugeot = new Car("peugeot", newEngine)
    println(peugeot.toString())

    // shopping cart exercise
    val courgettes = new Item("courgettes")
    val tomatoes = new Item("tomatoes")
    val claireCart = new Cart("Claire", List(courgettes, tomatoes))

    println(s"In ${claireCart.shopper}'s cart, there are:")
    for { item <- claireCart.content } {
        println(s"""¦ ${item.name}.stripMargin""")
    }
}
