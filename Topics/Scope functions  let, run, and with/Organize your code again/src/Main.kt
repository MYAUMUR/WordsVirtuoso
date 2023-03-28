data class Musician(var name: String = "", var band: String = "", var role: String = "")

fun main() {
    Musician()
        .apply {
            name = readln()
            band = readln()
            role = readln()
        }
        .run {
            println(
                """
            |Name: $name
            |Band: $band
            |Role: $role
        """.trimMargin()
            )
        }
}