fun main() {
    val car1 = Car("XUV700, 2021", "Akul", 116, 2200000.0, 2150000.0)
    car1.getCarFullDetails()
    val car2 = Car("ScorpioN, 2022", "Darshil", 76, 2000000.0, 1980000.0)
    car2.getCarFullDetails()
    val Cars = ArrayList<Car> (2)
    val car3 = Car("Nexon, 2017","Ram",90,1100000.0,1080000.0)
    val car4 = Car("Hariar, 2020","Shyam",200,1600000.0,1520000.0)
    Cars.add(car3)
    Cars.add(car4)
    for (i in Cars){
        println("-------------------")
        i.getCarFullDetails()
    }
}
class Car(private val model: String, private val owner: String, private val
miles: Int, private val original: Double, private val current: Double) {
    init {
        println("Object of class is Created and Init is Called.")
    }
    private fun info(): String {
        return model
    }
    private fun carowner(): String {
        return owner
    }
    private fun milesDrive(): Int {
        return miles
    }
    private fun orgprice(): Double {
        return original
    }
    private fun currprice(): Double {
        return current
    }
    fun getCarFullDetails() {
        println("----------")
        println("Car Information : ${info()}")
        println("Car owner : ${carowner()}")
        println("Miles Drive : ${milesDrive()}")
        println("Original Car Price : ${orgprice()}")
        println("Current Car Price : ${currprice()}")
        println("----------\n")
    }
}