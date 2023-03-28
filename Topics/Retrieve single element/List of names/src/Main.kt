fun main() {
    val list = readln().split(" ")
    // write your code here
    val res = list.firstOrNull() { it.startsWith("j") && it.endsWith("e") }

    println(res)
}