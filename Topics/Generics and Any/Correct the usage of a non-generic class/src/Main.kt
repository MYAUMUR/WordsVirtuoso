class Holder(var value: Any) {
    fun set(newValue: Any) = kotlin.run { value = newValue }
    fun get(): Any = value
}

fun main() = Holder(0).apply { set(256) }.get().let(::println)