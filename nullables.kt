fun main()
{
    var name1: String="Madarchod"
    name1=null //This is a compilation error cuz this variable only accepts non null data type only
    var name: String?="Behenchod" // The question mark specifies that the variable can accept null values

    var len=name1.length //length is accepted cuz non nullable
    var len1=name.length //nullable and hence length gives compilation error
    var len2=name?.length //question mark and hence non null is defined as nullable
    name?.let{ println(it.length) } //This is a safe case. let keyword is used to specify if-else case.
    //Here the length of name will only be printed if it is not null

}
