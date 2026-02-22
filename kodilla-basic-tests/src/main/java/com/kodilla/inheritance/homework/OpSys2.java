package com.kodilla.inheritance.homework;

public class OpSys2 extends OperatingSystem {
    public OpSys2(int productionYear){
        super(productionYear);
    }

    @Override
    public void turnOn() {
        System.out.println("System was turned on in an unexpected way.");
    }

    @Override
    public void turnOff() {
        System.out.println("System was turned off in an unexpected way.");
    }
}