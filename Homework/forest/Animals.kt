package forest

import com.sun.org.apache.xpath.internal.operations.Bool

/**
 * Created by max on 29.03.17.
 */


open class Animal(var i:Int) {
    var food = 5
    var cur_tree = 0

    open fun eat(t:Tree):Boolean {
        return false
    }
    fun produce():Boolean{
        if (food > 10) {
            println("Animal $i is ready to produce")
            return true
        }
        return false
    }
    fun check():Boolean {
        if (food < 0) {
            println("Animal $i is dead")
            return true
        }
        return false
    }
}


class Rabbit(var num: Int):Animal(num) {
    override fun eat(t: Tree):Boolean {
        if (t.low == 1) {
            food+=1
            println("$num found food")
            return true
        }
        println("$num is starving today")
        return false
    }
}

class Bird(var num:Int):Animal(num) {
    override fun eat(t: Tree):Boolean {
        if (t.head == 1) {
            food += 1
            println("$num found food")
            return true
        }
        println("$num is starving today")
        return false
    }
}

class Squirrel(var num:Int):Animal(num) {
    override fun eat(t: Tree):Boolean {
        if (t.mid == 1) {
            food += 1
            println("$num found food")
            return true
        }
        println("$num is starving today")
        return false
    }
}
