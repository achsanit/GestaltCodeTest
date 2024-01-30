package org.example

fun main() {
    carLoop()
}

fun carLoop() {

    val carList = listOf("Volvo", "BMW", "Toyota", "Kijang")
    var resultList = carList.toMutableList()

    for (i in carList.indices) {

        val item = carList[i]

        resultList.removeAt(i)
        resultList.add(0, item)

        println(resultList)

        resultList = carList.toMutableList()

    }

}