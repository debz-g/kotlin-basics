//CONSTRUCTORs are defined as an extension of the class. They are used to define any extra parameters or code segment within the class. They have the same na

fun main()
{
    var a= person("Debayan","Ghosh",19) //passing user defined parameters
    a.stateHobby()
    var c=person()
    c.hobby="Gaming"
    c.stateHobby()
    var d=person("Anshu","Pandey",20)
    d.test()

}

class person(first: String="Aryan", last: String="Pandey") //This is also called primary constructor
{
    var age:Int?=null
    var hobby:String="Esports"
    init {
        println("First Name: $first \n Last name: $last \n Age: $age")
    }

    fun stateHobby(){
        println("Hobby=$hobby")

    }
    constructor(first: String,last: String,agee:Int): //This is also called secondary constructor and it adds parameters to primary constructors.
            this(first, last){ // this keyword refers that the first and last value should be taken from the one in class parameters
                this.age=agee // this.age=agee refers that the value of the variable age should be equal to agee in contructor parameter
        println("First Name: $first \n"
    fun test(){
        println("Shit=$age")
    }
}
