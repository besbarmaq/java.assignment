package com.company.details;

public class Car {
    String brand;
    String carClass;
    int weight;

    public Car(String brand, String carClass, int weight) {
        this.brand=brand;
        this.carClass=carClass;
        this.weight=weight;
    }
    public static void main(String[] args) {
        Lorry lorry = new Lorry(2400, "Mercedes", "Robust", 4400);
        SportCar sportCar = new SportCar(349.06, "Mercedes-AMG", "Luxury", 1222);
        Engine engine = new Engine(888, "Mercedes V8");
        Person person = new Person(24, "Lewis Hamilton", 10);
        start();
        stop();
        turnLeft();
        turnRight();
        lorry.toString(lorry.brand, lorry.carClass,lorry.weight);
        engine.toString(engine.horsePower, engine.manufacturer);
        person.toString(person.fullName,person.drivingExperience);
    }
    public static void start(){
        System.out.println("Let's go");
    }
    public static void stop(){
        System.out.println("Let's stop");
    }
    public static void turnRight(){
        System.out.println("Turn right");
    }
    public static void turnLeft(){
        System.out.println("Turn left");
    }

    public void toString(String brand, String Cclass, int weight){
        System.out.println(brand+" "+carClass+" "+weight+ " ");
    }

}

