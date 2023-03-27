import kotlin.random.Random

fun generateTemperature(seed: Int): String {
    val random = Random(seed)
    return MutableList(7) { random.nextInt(20, 31) }.joinToString(" ")
}