fun main(args: Array<String>) {
    println("Crescente:")
    for (i in 0 .. 100 step 5) {
        println(i)
    }
    println("")
    println("Decrescente:")
    for (i in 100 downTo 0 step 5) {
        println(i)
    }
}