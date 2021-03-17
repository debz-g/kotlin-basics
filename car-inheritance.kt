open class Car(){
    var range: Int=0


    fun details(model: String,brand: String){
        println("Model: $model \n Brand: $brand")
    }
    fun extendRange(amount:Int){
        if(amount>0)
            range+=amount
        println("Range is: $range")
    }

    fun drive(distance:Int){
        println("Drove for $distance KMs")
    }
}

class ElectricCar(): Car(){

    fun battery(batt:Int){
        println("Battery Life: $batt")
    }

}

fun main(){
    var car1=Car()
    var car2=ElectricCar()
    car1.details("A3","Audi")
    car1.extendRange(200)
    car1.drive(100)
    car2.details("S", "Tesla")
    car2.extendRange(50)
    car2.drive(5000)
    car2.battery(200)
}
