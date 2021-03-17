data class user(var id: Int, val name: String, val age: String="") //Always should pass a parameter. Used when we need a simple class

fun main(){
    val us1=user(21,"Debayan","20")
    val us2=user(23,"Madhur","19")
    val us3=user(24,"Aryan")
    us3.id= 69
    println("${us1.name} \n ${us2.age} \n ${us3.id} ")

    println({us1.id}=={us2.id}) //Checks if equal or not. Can also do by us1.equals(us2)

    println("User Details: $us1") //Prints all the details

    val updateuser= us2.copy(name="Keshav") //Copies by changing only the variable assigned
    println("${updateuser.name}")

    println(updateuser.component1()) //Prints the first component of updated user class
    println(updateuser.component2())
    println(updateuser.component3())

    val(Iden,Name)=updateuser //Stores values of updateuser into variables Iden and Name
    println("ID:$Iden \n Name:$Name")

}
