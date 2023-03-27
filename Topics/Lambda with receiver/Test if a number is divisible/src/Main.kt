val isDivisible: Int.(Int) -> Boolean = { this % it == 0 }

fun main() {
    val (a, b) = readln().split(' ').map { it.toInt() }
    println(a.isDivisible(b))
}