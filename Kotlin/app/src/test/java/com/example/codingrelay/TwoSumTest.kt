package com.example.codingrelay

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.Assert.assertEquals

@RunWith(Parameterized::class)
class TwoSumTest(
    private val nums: List<Int>,
    private val target: Int,
    private val expected: List<Int>
) {

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data(): Collection<Array<Any>> = listOf(
            arrayOf(listOf(2, 7, 11, 15), 9, listOf(0, 1)),
            arrayOf(listOf(3, 2, 4), 6, listOf(1, 2)),
            arrayOf(listOf(3, 3), 6, listOf(0, 1)),
            arrayOf(listOf(7, 2, 11, 15), 9, listOf(0, 1)),
            arrayOf(listOf(0, 4, 3, 0), 0, listOf(0, 3)),
            arrayOf(listOf(-1, -2, -3, -4, -5), -8, listOf(2, 4)),
            arrayOf(listOf(Int.MAX_VALUE, Int.MIN_VALUE, 0), -1, listOf(0, 1)),
        )
    }

    @Test
    fun testTwoSum() {
        val actual = TwoSum.execute(nums, target).sorted()
        assertEquals(expected, actual)
    }
}