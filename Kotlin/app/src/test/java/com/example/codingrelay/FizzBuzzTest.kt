package com.example.codingrelay

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.Assert.assertEquals

@RunWith(Parameterized::class)
class FizzBuzzTest(
    private val n: Int,
    private val expected: List<String>
) {

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data(): Collection<Array<Any>> = listOf(
            arrayOf(1, listOf("1")),
            arrayOf(2, listOf("1", "2")),
            arrayOf(3, listOf("1", "2", "Fizz")),
            arrayOf(5, listOf("1", "2", "Fizz", "4", "Buzz")),
            arrayOf(6, listOf("1", "2", "Fizz", "4", "Buzz", "Fizz")),
            arrayOf(15, listOf("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz", "11","Fizz","13","14","FizzBuzz"))
        )
    }

    @Test
    fun test() {
        val actual = FizzBuzz().execute(n)
        assertEquals(expected, actual)
    }
}