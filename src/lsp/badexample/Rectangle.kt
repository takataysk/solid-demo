package lsp.badexample

open class Rectangle {
    open var width: Double = 0.0
    open var height: Double = 0.0

    fun calcArea(): Double {
        return width * height
    }
}
