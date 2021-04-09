fun main(){
    val stringList: List<String>= listOf("Anshu","Aryan", "Shiva", "Madhur")
    val mixedTypeList: List<Any>= listOf("Aryan", 31, 5, "BDay", 70.5, "weighs", "Kg")

    for (value in mixedTypeList){
        when (value) {
            is Int -> println("Integer: '$value'")
            is Double -> println("Double: '$value' and the floor value is '${floor(value}')
            is String -> println("String : $value and the length if the string is ${value.length})
            else -> println("Unknown Type")
                }
                }
                
                
    // SAFE CASTING            
    val obj1: Any= "I have a dream"
        if(obj1 !is Strin){
            println("Not a string")
        else{
            println("This is a string of length ${obj1.length}")
            }

        }
                    
    // EXPLICIT(UNSAFE) CASTING USING as KEYWORD
    val str1: String= obj1 as String
    println(str1)

    /*val obj2: Any= 1327
    val str2: String= obj2 as String 
    println(str2)*/


    //EXPLICIT(SAFE) CASTING USING as? KEYWORD 
    val obj3: Any= 1440
    val str3: String?= obj3 as? String // making str3 a nullable string
    println(str3) // prints null
