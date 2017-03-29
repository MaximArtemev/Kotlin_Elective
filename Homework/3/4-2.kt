/**
 * Created by max on 29.03.17.
 */


class Book(_name: String, _authName:List<String>, _publ: String,
           _year:Int, _city:String, _paper: String, _back:String, _ISBN:Int, _format:String) {
    var name = _name
    var authName = _authName
    var publ = _publ
    var year = _year
    var city = _city
    var paper = _paper
    var back = _back
    var ISBN = _ISBN
    var format = _format
    var genre:String = ""
    var theme = ""

    fun set_genre(s:String) { // why it is not working with setGenre?
        genre = s
    }
    fun set_theme(s:String) {
        theme = s
    }
}


fun main(args: Array<String>) {
    val b = Book("w", listOf("rr"), "qq", 12, "w", "w", "w", 123, "rr")
    println(b.name)
}

