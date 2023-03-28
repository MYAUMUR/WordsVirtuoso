import java.math.BigInteger

fun main() = getMaxBigInteger(readln().toBigInteger(), readln().toBigInteger()).let(::println)

private fun getMaxBigInteger(a: BigInteger, b: BigInteger) = (a + b + (a - b).abs()) / BigInteger.TWO