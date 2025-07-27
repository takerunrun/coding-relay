//
//  SquareRootTests.swift
//  CodingRelayTests
//
//  Created by Akihiro Kokubo on 2025/07/27.
//

@testable import CodingRelay
import Testing

struct SquareRootTests {
    @Test(arguments: [
        (0, 0),
        (1, 1),
        (2, 1),
        (3, 1),
        (4, 2),
        (8, 2),
        (9, 3),
        (10, 3),
        (15, 3),
        (16, 4),
        (17, 4),
        (24, 4),
        (25, 5),
        (26, 5),
        (2147395599, 46339),
        (2147395600, 46340),
        (2147483647, 46340)
    ])
    func execute(input: Int, expected: Int) {
        let actual = SquareRoot.execute(input)
        #expect(actual == expected)
    }
}
