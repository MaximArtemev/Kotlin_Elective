package forest

import java.util.*

/**
 * Created by max on 29.03.17.
 */

// graph of trees with connectivity


fun tick(place:MutableList<Tree>):MutableList<Tree> {
    for (i in place) {
        for (j in i.lives) {
            j.eat(i)
            j.check()
            // produce
        }
        i.grow()
    }
    for (i in 0..place.size-1) {
        //try {
        if (place[i].lives === mutableListOf<Animal>()) {
            println("pass")
            continue
        }

        for (j in place[i].lives) {
            var r = Random().nextInt(place.size)
            while (r == i) {
                r = Random().nextInt(place.size)
            }
            place[r].toAdd.add(j)
            place[i].toRemove.add(j)
        }
        //} catch (e: Exception) {
        //    println("woah")
        //}

    }
    for (i in place) {
        i.live_in()
        i.live_out()
    }
    return place
}


fun initTree(n:Int):MutableList<Tree> {
    val place = mutableListOf<Tree>()
    for (i in 0..n) {
        val t = Tree(i)
    //    t.grow()
        place.add(t)
    }
    return place
}

fun plantAnimals(n:Int, t:Tree) {
    var c = 0
    for (i in 0..n) {
        val a = Squirrel(c)
        c+=1
        t.lives.add(a)
    }
    for (i in 0..n) {
        val a = Bird(c)
        c+=1
        t.lives.add(a)
    }
    for (i in 0..n) {
        val a = Rabbit(c)
        c+=1
        t.lives.add(a)
    }
}
