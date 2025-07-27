//
//  FizzBuzzTests.swift
//  CodingRelayTests
//
//  Created by Akihiro Kokubo on 2025/07/27.
//

@testable import CodingRelay
import Testing

struct FizzBuzzTests {
    @Test(arguments: [
        (1, ["1"]),
        (2, ["1", "2"]),
        (3, ["1", "2", "Fizz"]),
        (5, ["1", "2", "Fizz", "4", "Buzz"]),
        (6, ["1", "2", "Fizz", "4", "Buzz", "Fizz"]),
        (15, ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]),
    ])
    func execute(n: Int, expected: [String]) {
        let actual = FizzBuzz.execute(n)
        #expect(actual == expected)
    }
}
