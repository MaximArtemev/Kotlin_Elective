fun faq(n:Int):Int {
    var nFaq = 1
    for (i in 1..n) {
        nFaq *= i
    }
    return nFaq
}

fun getC(n: Int, k: Int): Int {
    var ans = faq(n)/(faq(k)*faq(n-k))
    return ans
}

fun main(args: Array<String>) {
    var num = args[0].toInt()
    var lav = 1
    while (lav <= num) {
        for (i in 1..lav) {
            print(getC(lav, i).toString() + " ")
        }
        println()
        lav += 1
    }
}