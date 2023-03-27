import kotlin.random.Random

fun generatePredictablePassword(seed: Int): String {
    val randomPassword = Random(seed)
    // write your code here
    return MutableList(10) { randomPassword.nextInt(33, 127).toChar() }.joinToString("")
}