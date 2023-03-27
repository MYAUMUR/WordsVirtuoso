inline fun <reified T> muFun() {
    println(T::class.java)
}

fun main() {
    muFun<Int>()
}