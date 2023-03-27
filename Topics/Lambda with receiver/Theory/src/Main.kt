fun <T> doSomething(t: T): T {
    return t
}

fun <T> List<T>.calculateLength(): Int {
    return size
}

fun <T> calculateLength(list: List<T>): Int {
    return list.size
}

fun main() {
    val list = listOf("hello", "from", "hyperskill")
    list.calculateLength()
}

/*
val findAllStartsWithAa: List<String>.() -> List<String> = {
    filter { it.startsWith("A", ignoreCase = true) }
}

fun List<String>.findAllStartsWithA(): List<String> =
    filter { it.startsWith("A", ignoreCase = true) }
*/

