/**
 * Created by max on 24.03.17.
 */

fun get_s_i(s:String, num:Int):Char {
    return s[num]
}

fun giveLoopNum(i:Int): Int{
    return (i-1)/2
}

fun check(a:Char, b:Char):Boolean {
    return a!=b
}

fun check_pal(s: String) {
    for (i in 0..giveLoopNum(s.length)) {
        if (check(get_s_i(s, i), get_s_i(s, s.length - 1 - i))) {
            println("No")
            return
        }
    }
    println("yea")
    return
}


fun main(args: Array<String>) {
    check_pal(args[0])
}