class BiggerBox {
    class InnerBox<T>(var items: List<T>) {
        fun getSomethingFromBox(): List<T> = items
    }
}
typealias Box<T> = BiggerBox.InnerBox<T>
fun main() = Box(listOf("lion", "rose")).items.size.let(::println)
