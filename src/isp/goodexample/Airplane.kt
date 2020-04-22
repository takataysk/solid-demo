package isp.goodexample

class Airplane: RunVehicle, FlyVehicle {
    override fun run() {
        println("走ります")
    }

    override fun fly() {
        println("飛びます")
    }
}
