package com.clairedl.scala

abstract class Activity(val owner: String) {
    def cost: Int

    def name = this.getClass.getName()

    protected def frequency: Double = 50

    def renew_equipment: String = {
        if( frequency > 80 ) {
            s"For ${name} renew equipment every two years."
        }
        else {
            s"For ${name} renew equipment every two years."
        }
    }
}

class Skydiving(
    owner: String,
    val mainCanopy: Canopy,
    val reserve: Canopy,
    val rig: Rig)
        extends Activity(owner) {
            override def cost: Int = {
                mainCanopy.cost + reserve.cost + rig.cost
            }
            protected override def frequency: Double = 100
        }

class Canopy(val brand: String, val size: Int, val cost: Int)

class Rig(val brand: String, val cost: Int)

class Climbing(owner: String, val shoes: Footwear) extends Activity(owner) {
    override def cost: Int = 99
}

class Footwear(val brand: String, val size: Double)

