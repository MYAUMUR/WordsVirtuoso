fun main() {
    someFun("Haha")
}

inline fun <reified T> someFun(arg: T) {
    println("$arg + ${T::class.simpleName}")
}