@Suppress("MagicNumber")
fun main() = List(4) { readln().toBigInteger() }.let { println(it[0].abs() * it[1] + it[2] - it[3]) }
