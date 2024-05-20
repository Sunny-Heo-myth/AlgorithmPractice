package org.alan.algorithm.practice.baekjoon.gold.five;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class BJ14891Test {
    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("""
                        10101111
                        01111101
                        11001110
                        00000010
                        2
                        3 -1
                        1 1""", "7"),
                Arguments.of("""
                        11111111
                        11111111
                        11111111
                        11111111
                        3
                        1 1
                        2 1
                        3 1""", "15"),
                Arguments.of("""
                        10001011
                        10000011
                        01011011
                        00111101
                        5
                        1 1
                        2 1
                        3 1
                        4 1
                        1 -1""", "6"),
                Arguments.of("""
                        10010011
                        01010011
                        11100011
                        01010101
                        8
                        1 1
                        2 1
                        3 1
                        4 1
                        1 -1
                        2 -1
                        3 -1
                        4 -1""", "5")
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    public void test1(String input, String expected) {
        Assertions.assertEquals(expected, new BJ14891().solve(input));
    }
}
