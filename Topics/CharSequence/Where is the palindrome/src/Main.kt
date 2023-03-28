fun isPalindrome(str: CharSequence) = str contentEquals str.reversed()

fun main() {
    val numbers = mutableListOf(3, 5, 6, 4, 1, 8, 2, 7)
    val asReversed = numbers.asReversed()
    println(numbers.asReversed() === numbers.asReversed())
    println(numbers.reversed() === numbers.reversed())
}
