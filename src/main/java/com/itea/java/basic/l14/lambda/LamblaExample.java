package com.itea.java.basic.l14.lambda;

public class LamblaExample {

    public static void main(String[] args) {
        String s = "Hello";
        doEithObject(s, line -> System.out.println(s));
    }

    public static void doEithObject(Object obj, MyFunctionalInterface myFunctionalInterface) {
        myFunctionalInterface.method(obj);
    }
}
