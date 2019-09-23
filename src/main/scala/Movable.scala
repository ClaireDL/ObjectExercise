package com.clairedl.scala

abstract class Movable {
    def moveUp: Unit
    def moveDown: Unit
    def moveLeft: Unit
    def moveRight: Unit
}

class MovablePoint(
    protected var x: Int,
    protected var y: Int,
    protected var xSpeed: Int,
    protected var ySpeed: Int)
    extends Movable {

    def movablePoint(x: Int, y: Int, xSpeed: Int, ySpeed: Int): Unit = {
        println(s"attributes are: $x, $y, $xSpeed, $ySpeed")
    }

    override def toString: String = {
        s"$xSpeed"
    }

    override def moveUp: Unit = {
        println(s"move up")
    }
    override def moveDown: Unit = {
        println(s"move down")
    }
    override def moveLeft: Unit = {
        println(s"move left")
    }
    override def moveRight: Unit = {
        println(s"move right")
    }
}

class MovableCircle(
    private val radius: Int,
    private val center: MovablePoint
    ) extends Movable {

    def movableCircle(x: Int, y: Int, xSpeed: Int, ySpeed: Int, radius: Int): Unit = {
        println(s"Circle has $radius of radius")
    }

    override def toString: String = {
        s"$radius"
    }

    override def moveUp: Unit = {
        println(s"move up")
    }
    override def moveDown: Unit = {
        println(s"move down")
    }
    override def moveLeft: Unit = {
        println(s"move left")
    }
    override def moveRight: Unit = {
        println(s"move right")
    }
}
