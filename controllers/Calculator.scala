package controllers


class Calculator {
  def main(args: Array[String]) = println("I am a Calculator")
  
  def add(a: Int, b: Int) : Int =
  {
     var c: Int = 0
     c = a + b
     return c
  }
  
  def subtract(a: Int, b: Int) : Int = 
  {
    var c: Int = 0
    c = a - b
    return c
  }
  
}