

fun makeDecision(): String {
    return when ((1..3).random()) {
        1 -> "Rock"
        2 -> "Paper"
        else -> "Scissors"
    }
}