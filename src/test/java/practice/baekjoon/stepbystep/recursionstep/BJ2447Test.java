package practice.baekjoon.stepbystep.recursionstep;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BJ2447Test {

    @Test
    void bj2447_2Test() {
        // given
        BJ2447_2 sample1 = new BJ2447_2(3);
        BJ2447_2 sample2 = new BJ2447_2(9);
        BJ2447_2 sample3 = new BJ2447_2(27);

        // when
        sample1.matrix.setSquare(sample1.recur(3));
        sample2.matrix.setSquare(sample2.recur(9));
        sample3.matrix.setSquare(sample3.recur(27));

        // then
        assertEquals(sample1.stringify(), "***\n* *\n***");
        assertEquals(sample2.stringify(), "*********\n* ** ** *\n*********\n***   ***\n* *   * *\n***   ***\n*********\n* ** ** *\n*********");
        assertEquals(sample3.stringify(),
                "***************************\n" +
                "* ** ** ** ** ** ** ** ** *\n" +
                "***************************\n" +
                "***   ******   ******   ***\n" +
                "* *   * ** *   * ** *   * *\n" +
                "***   ******   ******   ***\n" +
                "***************************\n" +
                "* ** ** ** ** ** ** ** ** *\n" +
                "***************************\n" +
                "*********         *********\n" +
                "* ** ** *         * ** ** *\n" +
                "*********         *********\n" +
                "***   ***         ***   ***\n" +
                "* *   * *         * *   * *\n" +
                "***   ***         ***   ***\n" +
                "*********         *********\n" +
                "* ** ** *         * ** ** *\n" +
                "*********         *********\n" +
                "***************************\n" +
                "* ** ** ** ** ** ** ** ** *\n" +
                "***************************\n" +
                "***   ******   ******   ***\n" +
                "* *   * ** *   * ** *   * *\n" +
                "***   ******   ******   ***\n" +
                "***************************\n" +
                "* ** ** ** ** ** ** ** ** *\n" +
                "***************************");
    }

    @Test
    void bj2447_3Test() {
        // given
        BJ2447_3 sample1 = new BJ2447_3(3);
        BJ2447_3 sample2 = new BJ2447_3(9);
        BJ2447_3 sample3 = new BJ2447_3(27);

        // when
        sample1.chars = sample1.recur(3);
        sample2.chars = sample2.recur(9);
        sample3.chars = sample3.recur(27);

        // then
//        assertEquals(sample1.stringify(), """
//                ***
//                * *
//                ***
//                """);
//        assertEquals(sample2.stringify(), """
//                *********
//                * ** ** *
//                *********
//                ***   ***
//                * *   * *
//                ***   ***
//                *********
//                * ** ** *
//                *********
//                """);
//        assertEquals(sample3.stringify(), """
//                ***************************
//                * ** ** ** ** ** ** ** ** *
//                ***************************
//                ***   ******   ******   ***
//                * *   * ** *   * ** *   * *
//                ***   ******   ******   ***
//                ***************************
//                * ** ** ** ** ** ** ** ** *
//                ***************************
//                *********         *********
//                * ** ** *         * ** ** *
//                *********         *********
//                ***   ***         ***   ***
//                * *   * *         * *   * *
//                ***   ***         ***   ***
//                *********         *********
//                * ** ** *         * ** ** *
//                *********         *********
//                ***************************
//                * ** ** ** ** ** ** ** ** *
//                ***************************
//                ***   ******   ******   ***
//                * *   * ** *   * ** *   * *
//                ***   ******   ******   ***
//                ***************************
//                * ** ** ** ** ** ** ** ** *
//                ***************************
//                """);
    }
}
