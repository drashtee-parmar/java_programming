package com.company;
public class Main {
    public static void main(String[] args) {
        // creating an object for the class
        Car porsche = new Car(); // need to initialize it
        Car holden = new Car();
//        System.out.println("Model is " + porsche.getModel());


        porsche.setModels("Carrera");
        porsche.setModels("911");

        System.out.println("Model is " + porsche.getModel());
    }
}