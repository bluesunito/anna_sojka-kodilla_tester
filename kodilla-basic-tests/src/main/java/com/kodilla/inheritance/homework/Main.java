package com.kodilla.inheritance.homework;

public class Main {
    public static void main(String[] args) {
     OperatingSystem system1 = new OperatingSystem(2021);
     system1.turnOn();
     system1.turnOff();

     OpSys1 system2 = new OpSys1(2015);
     system2.turnOn();
     system2.turnOff();

     OpSys2 system3 = new OpSys2(2010);
     system3.turnOn();
     system3.turnOff();
    }
}
