fun main() {
    val input = readln()
    val regex = Regex("[A-Z][a-z]*( [A-Z][a-z]*)?")
    val matches = regex.findAll(input)
    for (match in matches) println(match.value)
}