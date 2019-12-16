package com.itea.java.basic.l14.example;

import java.util.Arrays;

public class MyCollection {

    private Object[] values;

    public MyCollection(Object... args) {
        values = Arrays.copyOf(args, args.length);
    }

    public MyCollectionPrinter printer() {
        return new MyCollectionPrinter();
    }

    public class MyCollectionPrinter {

        public void print() {
            for (Object o : values) {
                System.out.println(o);
            }
        }
    }
}
