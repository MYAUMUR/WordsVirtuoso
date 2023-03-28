data class Musician(var name: String = "", var band: String = "", var role: String = "")

@Suppress("MagicNumber")
fun main() = Musician().apply { name = readln(); band = readln(); role = readln() }
    .run { println(this); name.length }
    .let { (it / 4).also { println(it) } }
    .let { val num = it + 10; println(num) }