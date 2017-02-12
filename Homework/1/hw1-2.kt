/**
 * Created by max on 10.02.17.
 */


fun main(args: Array<String>) {
    var curChar = args[0][0]
    var count = 0
    for (i in args[0]) {
        if (i == curChar) {
            count += 1
        } else {
            print("$curChar$count")
            curChar = i
            count = 1
        }
    }
    if (count > 0) {
        print("$curChar$count")
    }
}
