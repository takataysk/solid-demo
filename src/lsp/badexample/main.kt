package lsp.badexample

fun main() {
    val rectangle1: Rectangle = Rectangle()
    rectangle1.width = 2.0
    rectangle1.height = 5.0
    println("rectangle1の面積 = ${rectangle1.calcArea()}")

    val rectangle2: Rectangle = Square()
    rectangle2.width = 2.0
    rectangle2.height = 5.0
    println("rectangle2の面積 = ${rectangle2.calcArea()}")
}
