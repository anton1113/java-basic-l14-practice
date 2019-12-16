package com.itea.java.basic.l14.example;

public class StaticInnerClassExample {

    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        inner.foo();
    }
}

class Outer {

    private int number;

    static class Inner {
        public void foo() {
//            System.out.println(inner); // error
            System.out.println("Hello from static inner class");
        }
    }
}
