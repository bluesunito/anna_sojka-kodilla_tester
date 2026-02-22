package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int productionYear;

    public OperatingSystem(int productionYear){
        this.productionYear = productionYear;
    }

    public void turnOn() {
        System.out.println("System was turned on.");
    }

    public void turnOff() {
        System.out.println("System was turned off.");
    }

}
