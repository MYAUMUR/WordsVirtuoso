interface MyInterface {
    fun print()
    val amount: Int
}

class AdditionPrinter : MyInterface {
    override fun print() { for (i in 1..amount) print("*") }
    override val amount: Int = 3 + 7
}

class SubtractionPrinter : MyInterface {
    override fun print() { for (i in 1..amount) print("*") }
    override val amount: Int = 23 - 15
}

class MultiplicationPrinter : MyInterface {
    override fun print() { for (i in 1..amount) print("*") }
    override val amount: Int = 3 * 4
}

class Printer(base: MyInterface) : MyInterface by base {
    override fun print() {
        for (i in 1..amount + 2) print("*")
    }
}

fun main() {
    val p = Printer(SubtractionPrinter())
    p.print()
}