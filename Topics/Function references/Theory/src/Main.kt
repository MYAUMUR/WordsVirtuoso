fun myString(init: StringBuilder.() -> Unit): String {
    return StringBuilder().apply(init).toString()
}

fun <T> T.apply(block: T.() -> Unit): T {
    this.block()
    return this
}

fun Int.applyInt(block: Int.() -> Int): Int {
    this.block()
    return this
}

fun <T> T.applyMe(block: (T) -> Unit): T {
    block(this)
    return this
}

data class Student(var name: String, var age: Int)

fun main() {
    val student = Student("Pavlo", 19).apply {
        name = this.name.uppercase()
        age += 1
    }
    println(student)
    val student2 = Student("Andrew", 13).applyMe {
        it.name = it.name.uppercase()
        it.age++
    }
    println(student2)
    println()
}
