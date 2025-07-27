//
//  TwoSumTests.swift
//  CodingRelayTests
//
//  Created by Akihiro Kokubo on 2025/07/27.
//

@testable import CodingRelay
import Testing

struct TwoSumTests {
    @Test(arguments: [
        ([2, 7, 11, 15], 9, [0, 1]),
        ([3, 2, 4], 6, [1, 2]),
        ([3, 3], 6, [0, 1]),
        ([7, 2, 11, 15], 9, [0, 1]),
        ([0, 4, 3, 0], 0, [0, 3]),
        ([-1, -2, -3, -4, -5], -8, [2, 4]),
        ([Int.max, Int.min, 0], -1, [0, 1]),
    ])
    func execute(nums: [Int], target: Int, expected: [Int]) {
        let actual = TwoSum.execute(nums: nums, target: target)
        #expect(actual.sorted() == expected)
    }
}
