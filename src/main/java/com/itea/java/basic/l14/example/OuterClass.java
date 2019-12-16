package com.itea.java.basic.l14.example;

public class OuterClass {

    public static void main(String[] args) {
        System.out.println(InnerClass.GG);
    }

    class InnerClass {

        private static final int GG = 1;
    }
}
