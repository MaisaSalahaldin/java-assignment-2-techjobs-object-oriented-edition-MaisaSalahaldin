package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Location extends   JobField{



    // TODO: Add a constructor that takes a string as a parameter and assigns it to the 'value' field. The
    //  constructor should also call the empty constructor in order to initialize the 'id' field.


    public Location(String value) {


        super(value);
    }


    // Custom toString, equals, and hashCode methods:

//    @Override
//    public String toString() {
//        return super.getValue();
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Location)) return false;
//        Location location = (Location) o;
//        return super.getId() == location.getId();
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(super.getId());
//    }

    // Getters and Setters:



}
