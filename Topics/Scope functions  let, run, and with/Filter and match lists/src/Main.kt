fun main() = readln().split(" ").run {
    println(count())
    associate { it.lowercase() to "[${it.length}]" }
}.let(::println)