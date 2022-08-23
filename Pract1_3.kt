fun main(args: Array<String>) {
    print("Enter any number:")
    val a = readLine()!!.toInt()
    if (a % 2 == 0) {
        println("$a is even")
    } else {
        println("$a is odd")
    }
}