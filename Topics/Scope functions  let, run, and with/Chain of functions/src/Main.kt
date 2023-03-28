data class Musician(var name: String = "", var band: String = "", var role: String = "")

@Suppress("MagicNumber")
fun main() {
    some()
}

fun some() {
    val myFun = Musician().runs {
        name = "Haha".run
        name.uppercase()
    }.also(::println)
    val anotherFun by lazy { Musician().runs {
        name = "Haha"
        name.uppercase()
    }.also(::println) }
    println("Before anotherFun is initialised")
    anotherFun + anotherFun
}

inline fun <T, R> T.runs(block: T.() -> R): R {
    return this.block()
}