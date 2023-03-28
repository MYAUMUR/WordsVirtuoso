// complete the definition
infix fun List<String>.secret(limit: Int): Int = sumOf { if (it.length > limit) it.length else 0 }