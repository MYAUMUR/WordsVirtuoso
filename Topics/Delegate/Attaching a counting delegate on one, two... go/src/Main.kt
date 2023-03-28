interface ICounter {
    var count: Int
    fun increaseCount()
    fun getCurrentCount(): Int
}

class Counter(override var count: Int) : ICounter {
    override fun increaseCount() {
        count++
    }

    override fun getCurrentCount(): Int = count
}

class Iterator(private val counter: ICounter) : ICounter by counter {
    fun next() = increaseCount()
}

fun main() {
    Iterator(Counter(readln().toInt())).also {
        for (i in 1..5) it.next()
        println(it.getCurrentCount())
    }
}
