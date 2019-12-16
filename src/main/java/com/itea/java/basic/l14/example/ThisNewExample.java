package com.itea.java.basic.l14.example;

public class ThisNewExample {

    public static void main(String[] args) {
        Trip trip = new Trip();
        Trip.Station station = trip.new Station();
        System.out.println(trip == station.trip());
    }
}
