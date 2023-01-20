//1.Primary Constructor
class Person constructor(val fname:String,val age:Int = 45){
    val firsName:String
    val perAge:Int

    //initials block
    init {
        firsName = fname
        perAge = age
        println("Firs Name = $firsName")
        println("Firs Name = $firsName Age = $age")

    }
}
