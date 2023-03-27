inline fun <reified T, R> convertList(list: List<T>, crossinline transform: (T) -> R): List<R> {
    return list.map(transform)
}