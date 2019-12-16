package com.itea.java.basic.l14.example;

public class AnonymousWithParameter {

    public static void main(String[] args) {
        Foo foo = new Foo("Hello") {
            {
                System.out.println("wait, what?");
            }
        };
    }


}

abstract class Foo {
    public Foo(String line) {
        System.out.println(line);
    }


}
