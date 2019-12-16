package com.itea.java.basic.l14.classwork;

public class ParentChildExample {

    public static void main(String[] args) {

        Object o1 = new String("gregdgr");
        Parent obj = new Child();


    }

    static class Parent {

        public void parentM() {

        }
    }

    static class Child extends Parent {

        public void childM() {

        }
    }
}
