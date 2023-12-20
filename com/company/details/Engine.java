package com.company.details;

public class Engine {
    int horsePower;
    String manufacturer;

    public Engine(int horsePower, String manufacturer) {
        this.horsePower = horsePower;
        this.manufacturer = manufacturer;
    }
    public void toString(int horsePower, String manufacturer){
        System.out.println(horsePower +" "+ manufacturer+" ");
    }
}

