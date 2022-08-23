fun main(){
    var d=10
    var c=20
    println("Before Swapping:")
    println("D=$d\nC=$c")
    d = d - c
    c = d + c
    d = c - d
    println("After swapping")
    println("D=$d\nC=$c")
}