package com.example.codingrelay

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.Assert.assertEquals

@RunWith(Parameterized::class)
class SquareRootTest(
    private val input: Int,
    private val expected: Int
) {

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data(): Collection<Array<Any>> = listOf(
            arrayOf(0, 0),
            arrayOf(1, 1),
            arrayOf(2, 1),
            arrayOf(3, 1),
            arrayOf(4, 2),
            arrayOf(8, 2),
            arrayOf(9, 3),
            arrayOf(10, 3),
            arrayOf(15, 3),
            arrayOf(16, 4),
            arrayOf(17, 4),
            arrayOf(24, 4),
            arrayOf(25, 5),
            arrayOf(26, 5),
            arrayOf(2147395599, 46339),
            arrayOf(2147395600, 46340),
            arrayOf(2147483647, 46340)
        )
    }

    @Test
    fun testSquareRoot() {
        val actual = SquareRoot.execute(input)
        assertEquals(expected, actual)
    }
}