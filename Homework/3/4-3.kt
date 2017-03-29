/**
 * Created by max on 29.03.17.
 */


class BookStorage() {
    var store = listOf<Shelf>()

    fun set_store(s:List<Shelf>) {
        store = s
    }
}

class Shelf(var _sizeH:Int, var _sizeW:Int, var _sizeL:Int, var _size:Int) {
    var sizeH = _sizeH
    var sizeW = _sizeW
    var sizeL = _sizeL
    var size = _size

}