package com.itea.java.basic.l14.classwork;

public class MyArray {

    private Object[] values;

    public MyArray(Object... values) {
        this.values = values;
    }

    public MyIterator iterator() {
        return new MyArrayIterator();
    }

    private class MyArrayIterator implements MyIterator {

        private int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor < values.length;
        }

        @Override
        public Object next() {
            return values[cursor++];
        }
    }
}
