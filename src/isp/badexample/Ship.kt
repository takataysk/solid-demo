package isp.badexample

class Ship: Vehicle {
    override fun run() {}

    override fun fly() {}

    override fun swim() {
        println("泳ぎます")
    }
}
