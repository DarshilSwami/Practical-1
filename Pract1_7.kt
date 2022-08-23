fun main() {
    print("Enter number:")
    val input = readLine()!!
    val num : Int = input.toInt()
    val ans : Long = getfact(num)
    print(ans)
}
tailrec fun getfact(num:Int,last:Int=1) : Long
{
    return if (num == 0)
    {
        last.toLong()
    }
    else
    {
        getfact(num-1,last*num)
    }
}