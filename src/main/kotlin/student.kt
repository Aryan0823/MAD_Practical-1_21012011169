class student(var Enrollment:Int){
    constructor():this(169)
    {
        println("Student Enrollment No.: $Enrollment")
    }
    init {
        println("S1 Enrollment:$Enrollment")
    }
}

fun main() {
//    println("Aryan_21012011169")
    var a1 = student()
}