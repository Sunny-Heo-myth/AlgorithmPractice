package org.alan.algorithm.practice.baekjoon.stepbystep.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class BJ1701Test {
    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("""
                        abcdabcabb""", "3"),
                Arguments.of("""
                        abcdefghijklmn""", "0"),
                Arguments.of("""
                        abcabcabc""", "6")

        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    public void test1(String input, String expected) {
        Assertions.assertEquals(expected, new BJ1701().solve(input));
    }
}
