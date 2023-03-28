interface Sweet

data class SweetBox<T : Sweet>(val sweet: T, val numOfSweets: Int)

class Chocolate : Sweet

class Marmelade : Sweet
