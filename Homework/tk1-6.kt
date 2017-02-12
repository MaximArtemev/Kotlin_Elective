import java.util.*

fun main(args: Array<String>) {
    for (i in 0..args.count() - 1) {
        if (args[i] == "*") {
            args[i + 1] = (args[i - 1].toInt() * args[i + 1].toInt()).toString()
            args[i] = "!"
            args[i - 1] = "!"
        }
    }
    var a = ArrayList<String>()
    for (i in args) {
        if (i != "!") {
            a.add(i)
        }
    }
    for (i in 0..a.count() - 1) {
        if (a[i] == "/") {
            a[i + 1] = (a[i - 1].toInt() / a[i + 1].toInt()).toString()
            args[i] = "!"
            args[i - 1] = "!"
        }
    }
    var b = ArrayList<String>()
    for (i in a) {
        if (i != "!") {
            b.add(i)
        }
    }
    var i = 0
    var num = 0
    while (i != b.count()) {
        if (b[i] == "+") {
            b[i+1] = (b[i+1].toInt() + b[i-1].toInt()).toString()
            i+=1
        } else {
            if (b[i] == "-") {
                b[i+1] = (b[i-1].toInt() - b[i+1].toInt()).toString()
                i+=1
            }
        }
        i+=1
    }
    println(b[b.count()-1])



}