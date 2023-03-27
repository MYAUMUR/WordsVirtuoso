fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    println(numbers.all(isEven))
    println(numbers.all { it < 100 })
}

val isEven: Int.() -> Boolean = { this % 2 == 0 }
val isPalindrome: String.() -> Boolean = { reversed() == this }