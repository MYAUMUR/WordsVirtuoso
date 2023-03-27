fun resume(marks: Triple<String, Int, List<Double>>): Pair<String, Double> {
    val allMarks = marks.third
    val average = allMarks.average()
    return marks.first to average
}