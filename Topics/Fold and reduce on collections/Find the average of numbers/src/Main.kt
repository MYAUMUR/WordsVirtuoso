fun main() = readln()
    .split(" ")
    .map { it.toDouble() }
    .run { println(reduce { acc, value -> acc + value } / size) }
