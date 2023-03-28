//fun main() {
//    val message = readln()
//    println(message).also { println("Note! I didn't die at the end of the Drive") }
//}

fun main() {
    val list1: List<String> = listOf("apple", "banana", "orange")
    val list2: List<String> = listOf("banana", "orange", "grapefruit", "apple")

    val allElementsInList: Boolean = allElementsInList(list1, list2)
    println(allElementsInList)
}

fun <T> allElementsInList(list1: List<T>, list2: List<T>): Boolean {
    for (element: T in list1) {
        if (!list2.contains(element as? T)) {
            return false
        }
    }
    return true
}