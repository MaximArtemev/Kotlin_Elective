import java.util.*

fun getPassword(num: Int, chance: Int = 3) {
    var ans = ""
    for (i in 0..num) {
        if (Random().nextInt(10000) % chance == 0) {
            ans += Random().nextInt(10).toString()
        } else {
            ans += (Random().nextInt(25) + 97).toChar()
        }
    }
    println(ans)
}


fun main(args: Array<String>) {
    getPassword(15, 3)
}