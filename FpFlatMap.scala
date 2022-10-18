package cz.madhouse.test

import fastparse._
import NoWhitespace._

object Main {

  def left[_:P] = P("ASDF")
  def right[_:P](left: Any) = P("JKL;")
  def flat[_:P] = left.flatMap(right)

  def main(args: Array[String]): Unit = {
    println(s"hello")
  }
}
