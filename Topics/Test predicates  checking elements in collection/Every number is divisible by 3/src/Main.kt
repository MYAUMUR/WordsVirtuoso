@Suppress("MagicNumber")
fun main() = readln().split(" ").map { it.toInt() }.all { it.isDivisibleBy(3) }.let(::println)

val isDivisibleBy: Int.(Int) -> Boolean = { this % it == 0 }