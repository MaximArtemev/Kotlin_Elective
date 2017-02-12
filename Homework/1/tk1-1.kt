

fun main(args: Array<String>) {
    try {
        println("Hello ${args[0]}")
    } catch (e: IndexOutOfBoundsException) {
        println("Hello, world")
    }
}