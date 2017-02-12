import java.util.*

fun main(args: Array<String>) {

    var a = Array<ArrayList<String>>(25, {ArrayList()})

    for (i in args) {
        a[i.get(0).toInt() - 97].add(i)
    }

    for (i in a) {
        for (j in i) {
            print(j)
            print(" ")
        }
        println()
    }
}

/** 97 - 122 **/
