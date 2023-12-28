package com.example.classes


class Car(
    val model: String = "BMW 320",
    val owner: String = "Mike",
    val year: Int = 2023,
) {
    init {
        println("Initializing Car class.")
    }

    fun startEngine() {
        println("Starting engine. Vroom, vroom!")
    }

    fun repair() {
        println("Your car is repaired. It will const you 300 EUR.")
    }

    fun drive() {
        println("Driving...")
    }

    fun parkAndTurnOffTheEngine() {
        println("Vrooom... Engine is off.")
    }

    fun getCarDetails() {
        println("Car model is: $model")
        println("Owner of $model is: $owner")
        println("Year of the model is: $year")
    }
}