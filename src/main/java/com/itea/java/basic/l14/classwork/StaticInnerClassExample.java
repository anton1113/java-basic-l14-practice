package com.itea.java.basic.l14.classwork;

public class StaticInnerClassExample {

    public static void main(String[] args) {

        Outer.Inner.VeryInner veryInner = new Outer.Inner.VeryInner();
        veryInner.m();
    }
}

class Outer {

    private int number;
    private static final int gg = 1;

    static class Inner {

        static class VeryInner {

            public void m() {
                System.out.println(/*number)*/);
                System.out.println(gg);
            }
        }
    }
}
