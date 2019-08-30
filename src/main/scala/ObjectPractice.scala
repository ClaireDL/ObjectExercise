package com.clairedl.scala

object Main extends App {
    // car exercise
    val newEngine = new Engine("bmw", "diesel")
    val peugeot = new Car("peugeot", newEngine)
    println( peugeot.toString() )

    // shopping cart exercise
    val courg_quant = new Quantity(4)
    val courgettes = new Item("courgettes", courg_quant)
    val tomatoes = new Item("tomatoes", 300, "g")

    val cart = new Cart(
        "Claire",
        List(courgettes, tomatoes)
        )

    println( s"In ${cart.shopper}'s cart, there are:" )
    for { item <- cart.content } {
        println( s"- ${item.name}" )
        println(item.quantity)
    }

    // nested list exercise
    // val my_list = new LLConstructor(2, LList(4, LListEnd))
    // println( my_list )

    // tree exercise
    val tree = Node(Element(2), Node(Element(3), Element(4)))
    println(tree)
}
