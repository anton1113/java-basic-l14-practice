package com.itea.java.basic.l14.classwork;

public class MyArrayIteratorTest {

    public static void main(String[] args) {

        MyArray myArray = new MyArray(1, 2, 3, 13, 54, 100);
        MyIterator myIterator = myArray.iterator();

        while (myIterator.hasNext()) {
            System.out.println(myIterator.next());
        }
    }
}
