/**
 * Created by max on 24.03.17.
 */

fun makeEmptySet(set:Set<Int>):MutableList<MutableList<Int>>  {
    val answ: MutableList<MutableList<Int>> = mutableListOf()
    for (i in set) {
        answ.add(mutableListOf())
    }
    return answ
}

fun make_ans(list: List<Int>, set:Set<Int>): List<List<Int>> {
    val answ: MutableList<MutableList<Int>> = makeEmptySet(set)
    var count = 0
    for (i in set) {
        for (j in 0..list.size-1) {
            if (i == list[j]) {
                answ[count].add(j) // I dunno how to wrap this in func
            }
        }
        count+=1
    }
    return answ
}

fun main(args: Array<String>) {
    val a: List<Int> = listOf(1,2,3,2,2,4,6)
    val s: Set<Int> = setOf(1,2,4)
    val ans: List<List<Int>> = make_ans(a, s)
    for (i in 0..ans.size-1) {
        for (j in 0..ans[i].size-1) {
            print(ans[i][j])
            print(' ')
        }
        println()
    }
    return
}