typealias johnArea = John.JohnApartment
typealias nickArea = Nick.NickApartment

class John {
    class JohnApartment(sizeOfRoom: Int) {
        val size: Int = sizeOfRoom
    }
}

class Nick {
    class NickApartment(sizeOfRoom: Int) {
        val size: Int = sizeOfRoom
    }
}

fun findTotalArea(): Int {
    return johnArea(40).size + nickArea(60).size
}
