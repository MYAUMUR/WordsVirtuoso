fun countUniqueChars(sequence: CharSequence): Int = sequence.groupBy { it }.size