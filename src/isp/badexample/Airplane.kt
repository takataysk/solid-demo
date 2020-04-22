package isp.badexample

class Airplane: Vehicle {
    override fun run() {
        println("走ります")
    }

    override fun fly() {
        println("飛びます")
    }

    override fun swim() {
    }
}
