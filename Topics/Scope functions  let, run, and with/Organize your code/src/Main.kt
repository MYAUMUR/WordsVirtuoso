fun main() {
    run {
        val day = readln()
        val month = readln()
        val year = readln()
        "$month.$day.$year"
    }.let(::println)
}