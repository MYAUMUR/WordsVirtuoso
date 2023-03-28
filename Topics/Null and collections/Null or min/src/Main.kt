fun main() = readln()
    .split(" ")
    .filter { it.first() in 'a'..'l' }
    .minWithOrNull(compareBy { it.length })
    .let(::println)