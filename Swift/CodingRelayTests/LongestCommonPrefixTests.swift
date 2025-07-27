//
//  LongestCommonPrefixTests.swift
//  CodingRelayTests
//
//  Created by Akihiro Kokubo on 2025/07/27.
//

@testable import CodingRelay
import Testing

struct LongestCommonPrefixTests {
    @Test(arguments: [
        (["flower", "flow", "flight"], "fl"),
        (["dog", "racecar", "car"], ""),
        (["a", "a", "a"], "a"),
        (["abc", "abc", "abc"], "abc"),
        (["abc", "ab", "a"], "a"),
        (["a", "ab", "abc"], "a"),
        (["", "a", "abc"], ""),
        (["", ""], ""),
        (["abc", ""], ""),
        (["a", "b", "c"], ""),
        (["abc", "def", "ghi"], ""),
        (["", "", ""], ""),
        (["abc"], "abc"),
        ([""], ""),
        (["abca", "abc", "ab"], "ab"),
        (["prefix", "pretest", "pre", "press"], "pre"),
        ([String(repeating:"a", count:200), String(repeating:"a", count:150), String(repeating:"a", count:100)], String(repeating:"a", count:100)),
    ])
    func execute(strs: [String], expected: String) {
        let actual = LongestCommonPrefix.execute(strs)
        #expect(actual == expected)
    }
}
