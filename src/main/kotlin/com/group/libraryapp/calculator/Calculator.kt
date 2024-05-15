package com.group.libraryapp.calculator

class Calculator(private var number: Int) {

    fun add(num: Int) {
        number += num
    }

    fun subtract(num: Int) {
        number -= num
    }

    fun multiply(num: Int) {
        number *= num
    }

    fun divide(num: Int) {
        if(num == 0) {
            throw IllegalArgumentException("Cannot divide by zero")
        }
        number /= num
    }

    fun getNumber(): Int {
        return number
    }
}