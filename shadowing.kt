fun add(a: Int)
{
var a=5
println(a) //This will print the value of the variable a and not the parameter value.
}

//This is called shadowing and it should be avoided as the value of the original scope is lost. Kotlin doesn't give\me
warning for shadowing variables.
