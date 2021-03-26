package com.company;

public class BMW extends Car {
    private String fromWhichCountry;


    public BMW(CarName name, String color, int year, NumberOfDoors numberOfDoors, String fromWhichCountry) {
        super(name, color, year, numberOfDoors);
        this.fromWhichCountry = fromWhichCountry;
    }

    public String getFromWhichCountry(){
        return fromWhichCountry;
    }



    @Override
    public void makeSignal() {
        System.out.println("paaap-paapap");

    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Это машина из " + fromWhichCountry);
    }
}
