package com.itea.java.basic.l14.classwork;

public class AnonymousClass {

    public static void main(String[] args) {

        class MyClassExample extends ClassExample {
            int plus(int a, int b) {
                return a + b;
            }
        }
        useCaseClassExample(new MyClassExample());

        ///////

        useCaseClassExample(new ClassExample() {
            int plus(int a, int b) {
                return a + b;
            }
        });
    }

    public static void useCaseClassExample(ClassExample classExample) {
        classExample.printFoo();
    }

    static class ClassExample {

        private String foo = "foo";

        public void printFoo() {
            System.out.println(foo);
        }
    }
}
