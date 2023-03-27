fun main() = readln().let {
    readln().split(' ').map { it.toInt() }.toMutableList().run {
        sort(this, if (it == "ascending") ::minOf else ::maxOf)
        this.forEach { e -> print("$e ") }
    }


}

fun sort(array: MutableList<Int>, comparator: (Int, Int) -> Int) {
    for (i in 0 until array.size - 1) {
        for (j in 0 until array.size - i - 1) {
            if (comparator(array[j], array[j + 1]) == array[j + 1]) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }
}