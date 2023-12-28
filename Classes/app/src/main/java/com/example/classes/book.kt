package com.example.classes

fun main() {
    val mazda = Car(model = "Mazda 3", owner = "Steven", year = 2004)
    mazda.getCarDetails()
    mazda.startEngine()
    mazda.drive()
    mazda.parkAndTurnOffTheEngine()
    mazda.repair()
    mazda.startEngine()
    mazda.drive()
    mazda.parkAndTurnOffTheEngine()
}