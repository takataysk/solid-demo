package isp.badexample

class Car: Vehicle {
    override fun run() {
        println("走ります")
    }

    override fun fly() {}

    override fun swim() {}
}
