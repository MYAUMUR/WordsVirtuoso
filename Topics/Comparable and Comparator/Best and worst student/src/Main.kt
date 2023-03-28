data class Student(val name: String, val grade: Int) : Comparable<Student> {
    override fun compareTo(other: Student): Int {
        return if (name.compareTo(other.name) == 0) other.grade - grade else name.compareTo(other.name)
    }
}
