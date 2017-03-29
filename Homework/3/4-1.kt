/**
 * Created by max on 29.03.17.
 */


open class Hello() {
    open var s = ""
    open fun pr() {
        println("Hello $s")
    }
}


class HelloMom():Hello() {
    override var s = "mom"
}

class HelloDad():Hello() {
    override var s = "dad"
}

class HelloStranger(str: String):Hello() {
    override var s = str
}

fun main(args: Array<String>) {
    val h = Hello()
    val hm = HelloMom()
    val hd = HelloDad()
    val hs = HelloStranger("me")
    h.pr()
    hm.pr()
    hd.pr()
    hs.pr()
}