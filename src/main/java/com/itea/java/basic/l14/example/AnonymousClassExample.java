package com.itea.java.basic.l14.example;

import java.util.Arrays;
import java.util.List;

public class AnonymousClassExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        printSubSet(numbers, new Condition() {
            @Override
            public boolean test(Integer number) {
                return number % 3 == 0;
            }
        });
    }

    public static void printSubSet(List<Integer> list, Condition condition) {
        for (Integer number : list) {
            if (condition.test(number)) {
                System.out.println(number);
            }
        }
    }

    interface Condition {
        boolean test(Integer number);
    }
}
