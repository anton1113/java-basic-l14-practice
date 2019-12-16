package com.itea.java.basic.l14.example;

public class Trip {

    private String id;
    private Station from;
    private Station to;

    public Station to() {
        return to;
    }

    public Station from() {
        return from;
    }

    public class Station {
        private String code;
        private String name;

        public Trip trip() {
            return Trip.this;
        }
    }
}
