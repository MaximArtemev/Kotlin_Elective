import kotlin.system.exitProcess

/**
 * Created by max on 28.03.17.
 */

fun sum(s:String, c:Char):String {
    return s+c
}

fun exep() {
    println("wrong input")
    exitProcess(0)

}

fun process(s:String, a:Int, b:Int):String {
    var ans: String = ""
    for (i in a..b) {
        try {
            ans += s[i]
        } catch (e: Exception) {
            exep()
        }
    }
    return ans
}

fun main(args: Array<String>) {
    val s:String = "hallomyfrund"
    val a = 2
    val b = 5
    println(process(s,a,b))
}