import java.util.*

fun main(args: Array<String>) {
    var count = args[0].toInt()
    var a = IntArray(10) {Random().nextInt(10)}.asList()
    a = a.sorted()
    println(a)
    println(a[a.count()/2])
}
