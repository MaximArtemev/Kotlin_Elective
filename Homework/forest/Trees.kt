package forest

import java.util.*

/**
 * Created by max on 29.03.17.
 */

class Tree(var i:Int) {
    var head = 0
    var mid = 0
    var low = 0

    var toAdd = mutableSetOf<Animal>()
    var toRemove = mutableSetOf<Animal>()

    var lives = mutableListOf<Animal>()

    fun grow() {
        head = Random().nextInt(2)
        mid = Random().nextInt(2)
        low = Random().nextInt(2)
        println("Tree $i is grown like head:$head, mid:$mid, low:$low")
    }


    fun live_in() {
        for (a in toAdd) {
            lives.add(a)
            val aNum = a.i
            println("Animal $aNum just jumped to $i Tree")
        }
        toAdd = mutableSetOf<Animal>()
    }

    fun live_out() {
        for (i in toRemove) {
            lives.remove(i)
        }
        toRemove = mutableSetOf<Animal>()
    }

}


