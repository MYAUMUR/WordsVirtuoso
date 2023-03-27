open class Storage<T : Book>() {

}

interface Watchable<T>

open class Book {}
class Magazine : Book() {}
class Stone {}

fun <T : Book> sortByDate(list: List<T>) { }
fun <T> sortByData(list: List<T>) where T : Book, T: Watchable<T> {

}

fun main() {
    val list1: List<Magazine> = listOf()
    var list2: List<String> = listOf()
    sortByDate(list1)
}

