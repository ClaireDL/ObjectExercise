package com.clairedl.scala

abstract class LList[+A]

class LLConstructor[A](val head: A, val tail: LList[A]) extends LList[A]

case object LListEnd extends LList[Nothing]
