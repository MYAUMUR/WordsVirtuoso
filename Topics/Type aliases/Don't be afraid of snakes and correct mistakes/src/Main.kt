typealias Snake = Pet.Reptile.Snake

class Pet {
    class Reptile {
        data class Snake(val str: String) {
            val sound = str
        }
    }
}
