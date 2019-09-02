package com.clairedl.scala

object Main extends App {
    // car exercise
    val newEngine = new Engine("bmw", "diesel")
    val peugeot = new Car("peugeot", newEngine)
    println( peugeot.toString() )

    println()

    // shopping cart exercise
    val courgettes = new Item("courgettes")
    val tomatoes = new Item("tomatoes")

    val cart = new Cart(
        "Claire",
        List(courgettes, tomatoes)
        )

    println( s"In ${cart.shopper}'s cart, there are:" )
    for { item <- cart.content } {
        println( s"- ${item.name}" )
    }

    println()
    // nested list exercise
    // val my_list = new LLConstructor(2, LList(4, LListEnd))
    // println( my_list )

    println()
    // tree exercise
    val tree = Node(Element(2), Node(Element(3), Element(4)))
    println(tree)

    println()
    // parachute exercise
    val main_F = new Canopy("Performance Design", 170, 2800)
    val reserve_F = new Canopy("Help me", 160, 1500)
    val rig_F = new Rig("Vector", 3500)

    val shoes = new Footwear("La Sportiva", 11)

    val myActivities: Seq[Activity] = Seq(
        new Skydiving("Fab", main_F, reserve_F, rig_F),
        new Climbing("Fab", shoes)
    )

    for { sport <- myActivities } {
        println(s"For ${sport.name}, ${sport.owner} has an equipment worth ${sport.cost}GBP")
        println(sport.renew_equipment)
    }
}

