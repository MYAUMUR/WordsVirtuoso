fun main() {
    val listOfNames = listOf("John", "Jane", "Mary", "Peter", "John", "Jane", "Mary", "Peter")

    val firstNotNullOf =
        listOfNames.firstNotNullOfOrNull<String, String> { item -> item.uppercase().takeIf { it.length > 5 } }
    println(firstNotNullOf)
}
