package com.clairedl.scala

class Car(val name: String, val engine: Engine) {
    override def toString(): String =
        s"The $name has a ${engine.brand} ${engine.engineType} engine."
}

class Engine(val brand: String, val engineType: String)

object Main extends App {
    val newEngine = new Engine("bmw", "whatever")
    val peugeot = new Car("peugeot", newEngine)
    println(peugeot.toString())
}
