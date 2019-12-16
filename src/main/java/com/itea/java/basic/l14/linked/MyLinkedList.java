package com.itea.java.basic.l14.linked;

public class MyLinkedList implements MyList {
    
    private MyLinkedListElement first;
    private MyLinkedListElement last;

    public void add(Integer elem) {
        if (first == null) {
            MyLinkedListElement myLinkedListElement = new MyLinkedListElement(null, null, elem);
            first = myLinkedListElement;
            last = first;
        } else {
            MyLinkedListElement myLinkedListElement = new MyLinkedListElement(last, null, elem);
            last.next = myLinkedListElement;
            last = myLinkedListElement;
        }
    }

    public Integer get(int index) {
        checkIndex(index);
        if (size() == 1) {
            return first.value;
        }
        MyLinkedListElement tmp = first;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
//
//        while (index-- > 0) {
//            tmp = tmp.next;
//        }
        return tmp.value;
    }

    private void checkIndex(int index) {
        if (size() < index) {
            throw new IllegalArgumentException("Index exceeds size!");
        }
        if (index < 0) {
            throw new IllegalArgumentException("Index < 0!");
        }
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }

        MyLinkedListElement tmp = first;
        int counter = 1;

        while (tmp.next != null) {
            tmp = tmp.next;
            counter++;
        }

        return counter;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void remove(Integer elem) {

    }

    public void add(int index, Integer elem) {

    }

    public MyIterator iterator() {
        return new MyLinkedListIterator();
    }

    private class MyLinkedListIterator implements MyIterator {

        private MyLinkedListElement cursor;

        public MyLinkedListIterator() {
            if (!isEmpty()) {
                cursor = first;
            }
        }

        public boolean hasNext() {
            return cursor.next != null;
        }

        public Integer next() {
            Integer result = cursor.value;
            cursor = cursor.next;
            return result;
        }
    }

    private class MyLinkedListElement {
        
        private MyLinkedListElement previous;
        private MyLinkedListElement next;
        private int value;

        public MyLinkedListElement(MyLinkedListElement previous, MyLinkedListElement next, int value) {
            this.previous = previous;
            this.next = next;
            this.value = value;
        }

        public void setPrevious(MyLinkedListElement previous) {
            this.previous = previous;
        }

        public void setNext(MyLinkedListElement next) {
            this.next = next;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
