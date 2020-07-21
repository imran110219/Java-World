package com.sadman.TDD;

public class Main {
    public static void main(String[] args) {
        Checker checker = new Checker();
        System.out.println(checker.checkState(0));
        System.out.println(checker.checkState(1));
        System.out.println(checker.checkState(5));
        System.out.println(checker.checkState(9));
        System.out.println(checker.checkState(10));
        System.out.println(checker.checkState(11));
        System.out.println(checker.checkState(15));
        System.out.println(checker.checkState(19));
    }
}
