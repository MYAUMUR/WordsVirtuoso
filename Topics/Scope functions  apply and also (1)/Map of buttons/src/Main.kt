data class TextField(
    var text: String = "Hello!",
    var textSize: Int = 12,
    var fontFamily: String = "Roboto"
)

fun main() {
    val textField = TextField()

    @Suppress("MagicNumber")
    val valuesMap = mapOf<String, Int>(
        "Cancel" to 12,
        "Button" to 14,
        "Submit" to 13
    )

    textField
        .apply {
            readln().let {
                text = it
                textSize = valuesMap[it] ?: textSize
            }
        }
        .also { println("New settings: $it") }

}