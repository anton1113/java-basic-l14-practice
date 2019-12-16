package com.itea.java.basic.l14.example;

public class ScopeInnerClassExample {

    public static void main(String[] args) {

        while (true) {
            if (1 == 1) {
                class ScopeInnerClass {
                }
                new ScopeInnerClass();
            }
        }
    }
}
