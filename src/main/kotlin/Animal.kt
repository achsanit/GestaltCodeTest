package org.example


fun main() {

    val cat = Cat("Puddle")
    println(cat.makeSound())

    val dog = Dog("Buldog")
    println(dog.makeSound())

}

open class Animal(val name: String) {

    open fun makeSound(): String {
       return "Aku adalah Hewan"
    }

}

class Cat(name: String): Animal(name) {
    override fun makeSound(): String {
        return "Meow"
    }
}

class Dog(name: String): Animal(name) {
    override fun makeSound(): String {
        return "Woof"
    }
}