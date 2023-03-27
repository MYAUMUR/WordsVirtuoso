data class Account(
    val id: Int = 1,
    val amount: Int = 0,
    val result: Int = 0,
    val status: String = "START"
)

@SuppressWarnings("MagicNumber")
fun calculateOperation(init: Account, func: Account.() -> Account): Account = init.copy(amount = 50).func()

fun main() {
    val (inc, cte) = readln().split(' ').map { it.toInt() }
    calculateOperation(Account()) { copy(result = amount * inc * cte, status = "END") }.let(::println)
}