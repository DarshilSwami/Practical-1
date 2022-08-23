fun main() {
    var student1 = Student("Chandresh Swami")
    student1.info()
}
open class Person(var name: String = "X") {
    fun info (){
        println("Enrollment No: 20012011166\n")
        println(name + " is a student.")
        println(name + " is currently in 3rd year of B.Tech .")
    }
}
class Student(name: String): Person("Darshil Swami") {
}
