package com.itea.java.basic.l14.linked;

public class MyLinkedListTest {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);

//        System.out.println(myLinkedList.size());

//        System.out.println(myLinkedList.get(0));
//        System.out.println(myLinkedList.get(1));

        MyIterator myIterator = myLinkedList.iterator();

        while (myIterator.hasNext()) {
            System.out.println(myIterator.next());
        }
    }
}
