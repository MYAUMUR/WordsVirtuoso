private const val MIN_NOTIFIED_GRADE = 5

fun main() {
    val list = readln().split(" ").map { it.toDouble() }
    val greaterThan5 = list.find { it >= MIN_NOTIFIED_GRADE }
    val highestGrade = list.maxOf { it }
    println("$greaterThan5:$highestGrade")
}