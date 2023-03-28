data class Microphone(
    var track: String = "",
    var frequency: Int = 0,
    var effect: String = "",
    var sensitivity: Double = 0.0
)

fun main() = Microphone().apply {
    track = readln()
    frequency = readln().toInt()
    effect = readln()
    sensitivity = readln().toDouble()
}.let(::println)