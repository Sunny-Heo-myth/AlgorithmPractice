package practice.baekjoon.stepbystep.recursionStep;

import practice.baekjoon.stepbystep.utils.InputUtil;

import java.io.IOException;

public class BJ25501_2 {
    public int recursionCount = 0;

    public static void main(String[] args) throws IOException {
        BJ25501_2 instance = new BJ25501_2();
        InputUtil.answer(instance::isPalindrome, s -> instance.recursionCount);
    }

    public int isPalindrome(String s){
        recursionCount = 0;
        return recursion(s, 0, s.length() - 1);
    }

    private int recursion(String s, int l, int r){
        recursionCount++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l + 1, r - 1);
    }

}
