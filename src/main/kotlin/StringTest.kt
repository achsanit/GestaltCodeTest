package org.example

fun main() {

    val txt = "Coding merupakan kegiatan yang dimana kamu memberitahukan komputer apa yang harus dia kerjakan untuk kamu. Sebuah kode yang ada pada skrip bisa diibaratkan layaknyabahasa sehari-hari. Setiap kode yang kamu tulis akan membantu komputer untuk mengetahuidan memahami apa yang ingin kamu lakukan pada komputer"

    val string1 = StringTest(txt)

    println(string1.lengthOfString())
    println(string1.countWordInString())
    println(string1.countVowelLetters())
    println(string1.countConsonantLetters())
    println(string1.findMostFrequentWord())
}

class StringTest(
    private val txt: String
) {

    fun lengthOfString(): Int { return txt.length }

    fun countWordInString(): Int {
        return txt.split(" ").size
    }

    fun countVowelLetters(): Int {
        var count = 0
        val vowels = setOf("a", "i", "u", "e", "o")

        txt.forEach {
            if (it.lowercase() in vowels) {
                count++
            }
        }

        return count
    }

    fun countConsonantLetters(): Int {
        var count = 0
        val vowels = setOf("a", "i", "u", "e", "o")

        txt.forEach {
            if (it.lowercase() !in vowels && it.isLetter()) {
                count++
            }
        }

        return count
    }

    fun findMostFrequentWord(): String {
        val words = txt.split(" ")
        val wordFrequency = mutableMapOf<String, Int>() // --> "chair" = 1 ...

        for (word in words) {
            val count = wordFrequency.getOrDefault(word, 0) // get count first if no value return default 0
            wordFrequency[word] = count + 1 // plus 1 for count
        }

        var mostFrequentWord = ""
        var maxFrequency = 0
        for ((word, frequency) in wordFrequency) {
            if (frequency > maxFrequency) {
                mostFrequentWord = word
                maxFrequency = frequency
            }
        }

        return mostFrequentWord
    }
}