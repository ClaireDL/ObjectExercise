package com.clairedl.scala
import java.{util => ju}

abstract class Tree

case class Node(left: Tree, right: Tree) extends Tree

case class Element[A](val value: A) extends Tree
