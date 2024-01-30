package org.example

fun main() {
    val arr = arrayOf(
        arrayOf(9, 5, 2),
        arrayOf(1, 3, 8),
        arrayOf(10, 15, 12),
        arrayOf(4, 7, 6),
        arrayOf(13,11, 14),
    )

    val myArray = ArrayTest(arr)
    myArray.arrayDescOrderByElement()
    myArray.arrayAscOrderByElement()

    println(myArray.countOddArray())
    println(myArray.findHighestElement().joinToString(prefix = "[", postfix = "]"))

}


class ArrayTest(private val arr: Array<Array<Int>>) {

    fun arrayDescOrderByElement() {
        arr.forEach { row ->
            println(row.sortedDescending().joinToString(prefix = "[", postfix = "]"))
        }
    }

    fun arrayAscOrderByElement() {
        arr.forEach { row ->
            println(row.sorted().joinToString(prefix = "[", postfix = "]"))
        }
    }

    fun countOddArray(): Int {
        var oddArray = 0

        arr.forEach { row ->
            if (row.sum() % 2 == 1) {
                oddArray++
            }
        }

        return oddArray
    }

    fun findHighestElement(): Array<Int> {
        var highestElement = arrayOf(0, 0, 0)

        arr.forEach {
            if (it.sum() > highestElement.sum()) {
                highestElement = it
            }
        }

        return highestElement
    }
}


