package com.kodilla.inheritance.homework;

public class OpSys1 extends OperatingSystem {
        public OpSys1(int productionYear){
            super(productionYear);
        }

    @Override
    public void turnOn() {
        System.out.println("System was turned on but in a slightly different way.");
    }

    @Override
    public void turnOff() {
            System.out.println("System was turned off but in a slightly different way.");
    }
}
