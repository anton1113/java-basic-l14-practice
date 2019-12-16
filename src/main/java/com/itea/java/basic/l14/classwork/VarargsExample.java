package com.itea.java.basic.l14.classwork;

import java.util.Arrays;

public class VarargsExample {

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3};
        printArray(array);
        printArray(1, 3, 4, 10, 12);
    }

    public static void printArray(Object... args) {
        System.out.println(Arrays.toString(args));
    }
}
