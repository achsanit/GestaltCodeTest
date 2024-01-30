package org.example

fun main() {
    numLoop(10)
}

fun numLoop(n: Int) {

    for (i in 1..n) {
        if (i < n/2 + 1) {
            for (x in 1..i) {
                print(0)
            }
            print(i)
        } else {
            print(i)
            for (x in 1..i) {
                print(0)
            }
        }
        println()
    }

}