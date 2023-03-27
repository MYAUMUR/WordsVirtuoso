class RandomClass<T, S, U>(private val value1: T, private val value2: S, private val value3: U) {
    fun getFirstValue(): T = value1
    fun getSecondValue(): S = value2
    fun getThirdValue(): U = value3
}