package com.company.details;

public class Driver {
    String fullName;
    int drivingExperience;

    public Driver(String fullName, int drivingExperience) {
        this.fullName = fullName;
        this.drivingExperience = drivingExperience;
    }
    public void toString(String fullName, int drivingExperience){
        System.out.println(fullName +" "+ drivingExperience+" ");
    }
}
