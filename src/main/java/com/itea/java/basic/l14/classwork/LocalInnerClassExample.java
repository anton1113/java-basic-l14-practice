package com.itea.java.basic.l14.classwork;

public class LocalInnerClassExample {

    public static void main(String[] args) {

        int i = 10;
        class MyLocalInnerClass {

            private String foo = "foo_string";

            public void printFoo() {
                System.out.println(foo);
            }
        }
        MyLocalInnerClass myLocalInnerClass = new MyLocalInnerClass();
        myLocalInnerClass.printFoo();
    }
}
