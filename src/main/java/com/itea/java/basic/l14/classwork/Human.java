package com.itea.java.basic.l14.classwork;

public class Human {

    public static void main(String[] args) {
        Human human = new Human();
        Human.Leg leg = human.new Leg();
        Human another = leg.getHuman();
    }

    private String name;

    public void method() {
        System.out.println();
    }

    public class Leg {

        private int size;

        public Human getHuman() {
            return Human.this;
        }

        public void method() {
            System.out.println(size);
            System.out.println(name);
        }
    }
}
