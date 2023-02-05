package practice.baekjoon.stepbystep.twoDimensionalArray;

import org.junit.jupiter.api.Test;
import practice.baekjoon.stepbystep.twodimensionalarray.BJ2563;

public class BJ2563Test {
    private String input1 = "3\n" +
            "3 7\n" +
            "15 7\n" +
            "5 2";
    private String input2 = "4\n" +
            "0 0\n" +
            "10 10\n" +
            "20 20\n" +
            "30 30";
    @Test
    void initTest() {
        BJ2563 instance = new BJ2563(input1);
        System.out.println();
    }

    @Test
    void attachTest() {
        BJ2563 instance = new BJ2563(input1);
        instance.attach();
        System.out.println();
    }

    @Test
    void countTest1() {
        BJ2563 instance = new BJ2563(input1);
        instance.attach();
        System.out.print(instance.count());
    }

    @Test
    void countTest2() {
        BJ2563 instance = new BJ2563(input2);
        instance.attach();
        System.out.print(instance.count());
    }
}