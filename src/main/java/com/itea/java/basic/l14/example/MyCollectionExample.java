package com.itea.java.basic.l14.example;

public class MyCollectionExample {

    public static void main(String[] args) {
        MyCollection myCollection = new MyCollection(1, 2, 3);
        MyCollection.MyCollectionPrinter myCollectionPrinter = myCollection.printer();
        myCollectionPrinter.print();
    }
}
