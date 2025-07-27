package com.example.codingrelay

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.Assert.assertEquals

@RunWith(Parameterized::class)
class LongestCommonPrefixTest(
    private val strs: List<String>,
    private val expected: String
) {

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data(): Collection<Array<Any>> = listOf(
            arrayOf(listOf("flower", "flow", "flight"), "fl"),
            arrayOf(listOf("dog", "racecar", "car"), ""),
            arrayOf(listOf("a", "a", "a"), "a"),
            arrayOf(listOf("abc", "abc", "abc"), "abc"),
            arrayOf(listOf("abc", "ab", "a"), "a"),
            arrayOf(listOf("a", "ab", "abc"), "a"),
            arrayOf(listOf("", "a", "abc"), ""),
            arrayOf(listOf("", ""), ""),
            arrayOf(listOf("abc", ""), ""),
            arrayOf(listOf("a", "b", "c"), ""),
            arrayOf(listOf("abc", "def", "ghi"), ""),
            arrayOf(listOf("", "", ""), ""),
            arrayOf(listOf("abc"), "abc"),
            arrayOf(listOf(""), ""),
            arrayOf(listOf("abca", "abc", "ab"), "ab"),
            arrayOf(listOf("prefix", "pretest", "pre", "press"), "pre"),
            arrayOf(
                listOf(
                    "a".repeat(200),
                    "a".repeat(150),
                    "a".repeat(100)
                ),
                "a".repeat(100)
            )
        )
    }

    @Test
    fun testLongestCommonPrefix() {
        val actual = LongestCommonPrefix.execute(strs)
        assertEquals(expected, actual)
    }
}