package com.company;

public class Car {
    private String Цвет;
    private int Год;
    private NumberOfDoors numberOfDoors;
    private CarName name;
    private boolean theLamp;
    public final int KM = 100;

    public Car(CarName name, String цвет, int год, NumberOfDoors numberOfDoors) {
        this.Цвет = цвет;
        this.Год = год;
        this.numberOfDoors = numberOfDoors;
        this.name = name;
    }

    public Car(CarName name, String цвет, int год, NumberOfDoors numberOfDoors, String whichCountryfrom) {
    }


    public String getЦвет() {
        return Цвет;
    }

    public int getГод() {
        return Год;
    }

    public NumberOfDoors getNumberOfDoors() {
        return numberOfDoors;
    }


    public CarName getName() {
        return name;
    }


    public void makeSignal() {

    }

    public void РасходТоплива(double fuel, double coveredDistance) {
        double fuelConsumption = fuel / coveredDistance * KM;
        System.out.println("Расход топлива = " + fuelConsumption + " l/fuel for 100 km");
    }

    public void РасходТоплива(double KM, double fuel, double coveredDistance){
        double fuelConsumption = fuel / coveredDistance * KM;
        System.out.println("Расход топлива = " + fuelConsumption + " l/fuel for 100 km");
    }

    public void РасходТоплива(int KM, double fuel, double coveredDistance){
        double fuelConsumption = fuel/coveredDistance * KM;
        System.out.println("Расход топлива = " + fuelConsumption + " l/fuel for 100 km");
    }


    public void getInfo() {
        System.out.println("Название машины = " + getName() + "\nЦвет = " + Цвет + "\nГод = " + Год + "\nNumber of doors ="
         + numberOfDoors.getNumberOfDoors());
    }


}
