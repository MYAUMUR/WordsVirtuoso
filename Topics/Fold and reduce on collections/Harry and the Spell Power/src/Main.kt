data class Spell(val name: String, val power: Int)

fun main() {
    val input = readln().split(" ")
    val spells = input.map { Spell(it.split("-")[0], it.split("-")[1].toInt()) }

    // write your code here
    val res = spells.fold(0) { acc, spell -> if (spell.power >= 40) acc + spell.power else acc }

    println(res)
}