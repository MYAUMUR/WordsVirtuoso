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

typealias JohnArea = John.JohnApartment
typealias NickArea = Nick.NickApartment

fun findTotalArea(): Int {
    val johnRoomArea = JohnArea(40).size
    val nickRoomArea = NickArea(60).size
    return johnRoomArea + nickRoomArea
}
