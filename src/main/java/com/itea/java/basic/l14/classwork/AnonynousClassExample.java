package com.itea.java.basic.l14.classwork;

import java.util.Scanner;

public class AnonynousClassExample {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        PositiveCondition condition = new PositiveCondition();
        int number = SCANNER.nextInt();
        printIfCondition(number, new Condition() {
            @Override
            public boolean test(Integer number) {
                return number < 0;
            }
        });
        printIfCondition(number, new Condition() {
            @Override
            public boolean test(Integer number) {
                return number % 2 == 0;
            }
        });
    }

    public static void printIfCondition(Integer number, Condition condition) {
        if (condition.test(number)) {
            System.out.println(number);
        }
    }

    private static class PositiveCondition implements Condition {

        @Override
        public boolean test(Integer number) {
            return number > 0;
        }
    }
}
