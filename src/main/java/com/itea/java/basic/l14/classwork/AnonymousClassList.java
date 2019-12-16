package com.itea.java.basic.l14.classwork;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnonymousClassList {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        List<Integer> list = getRandomList();
        doWithList(list, new Function() {
            @Override
            public void doSomething(Integer integer) {
                System.out.println(integer);
            }
        });
        doWithList(list, integer -> System.out.println(integer));
    }

    private static void doWithList(List<Integer> list, Function function) {
        for (int number : list) {
            function.doSomething(number);
        }
    }

    private static List<Integer> getRandomList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(RANDOM.nextInt(100));
        }
        return list;
    }

    private static interface Function {

        void doSomething(Integer integer);

    }
}
