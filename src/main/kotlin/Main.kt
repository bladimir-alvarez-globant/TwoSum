package org.example

class TwoSum() {
    private val numbers = mutableListOf<Int>()

    fun add(number: Int) = numbers.add(number)

    fun find(target: Int): Pair<Int, Int>? {
        val foundNumbers = hashMapOf<Int, Int>()

        numbers.forEachIndexed { index, number ->
            val numberToFind = target - number

            if(foundNumbers.containsKey(numberToFind)) {
                return Pair(index + 1, foundNumbers[numberToFind]!! + 1)
            }

            foundNumbers[number] = index
        }

        return null
    }

}

fun main() {
    data.forEach {  numbers ->
        val twoSum = TwoSum()
        numbers.forEach {
            twoSum.add(it)
        }
        val target = 9
        val result = twoSum.find(target)

        if(result != null) {
            println("Index1: ${result.first} Index2: ${result.second}")
        } else {
            println("No results")
        }
    }
}

val data = listOf(
    listOf(2, 7, 11, 15),
    listOf(2, 11, 15, 7),
    listOf(11, 15, 7, 2),
    listOf(15, 2, 11, 7)
)