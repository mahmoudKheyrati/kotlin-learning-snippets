package collections

import kotlin.random.Random


fun main() {
    val numbers = (0..10).asSequence()
    println(numbers)

    val seq = generateSequence(0) {
        println("generate seq")
        Random.nextInt()
    }

    val sequence = seq.map {
        println("map $it")
        it * Random.nextInt()
    }.take(10).groupingBy {
        println("group $it")
        it % 3
    }

    println(sequence.eachCount())


}
