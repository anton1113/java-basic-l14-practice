package com.itea.java.basic.l14.example;

public class LocalInnerClass {

    public static void main(String[] args) {
        class SomeClass {
            public void m() {
                System.out.println("Some text");
            }
        }
        SomeClass someClass = new SomeClass();
        someClass.m();
    }
}
