package com.clairedl.scala

abstract class Tree

class Node(left: Any, right: Any) extends Tree

class Stem(val value: Any) extends Tree
