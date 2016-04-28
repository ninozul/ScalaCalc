package controllers


object CalcApp extends App {
    new Calculator().main(Array())
    print("1 + 1 = ")
    println(new Calculator().add(1, 1))
    print("2 - 1 = ")
    println(new Calculator().subtract(2, 1))
}