package forest

import java.util.*

/**
 * Created by max on 29.03.17.
 */


fun main(args: Array<String>) {
    var place = initTree(10)
    plantAnimals(2, place[0])
    place = tick(place)
    println("------------")
    place = tick(place)
    place = tick(place)
    println("And the final answer is")
    for (i in place) {
        for (j in i.lives) {
            println("At Tree ${i.i} live ${j.i} Animal")
        }
    }
}