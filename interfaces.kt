interface drivable{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The driver is breakable")
    }
}

open class Car(override maxSpeed: Double,val model:String, val brand:String): drivable{ //we need to create a body for drive()

    var range:Int=0

    fun extendRange(amount:Int){
        if(amount>0)
            range+=amount
        println("Range is: $range")
    }

    override fun drive(): String {
        return "Driving the interface drive"
    }

    // override fun drive(): String= "Driving the interface drive"    This can also be done.


    fun drive(distance:Int){ //this drive function does not return string and hence will not act as body of the drive function present in the interface

        println("Drove for $distance KMs")
    }

}

open class ElectricCar(maxSpeed: Double, model: String,brand: String, var bLife: Int): Car(maxSpeed,model,brand){
    override var range= bLife*6
}
