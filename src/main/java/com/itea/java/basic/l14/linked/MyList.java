package com.itea.java.basic.l14.linked;

public interface MyList {

    void add(Integer elem);

    int size();

    boolean isEmpty();

    void remove(Integer elem);

    void add(int index, Integer elem);

    Integer get(int index);
}
