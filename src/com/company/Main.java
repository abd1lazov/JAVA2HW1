package com.company;

public class Main {

    public static void main(String[] args) {
        BMW bmw = new BMW(CarName.BMW, "BLACK", 2020, new NumberOfDoors(4),"Germany");
        bmw.getInfo();
        bmw.makeSignal();
        bmw.РасходТоплива(5.5, 40);


        System.out.println("-------------------------");

        MERSEDES_BENZ mers = new MERSEDES_BENZ(CarName.MERSEDES_BENZ, "Black", 2020, new NumberOfDoors(2), "Germany",6.3);
        mers.getInfo();
        mers.makeSignal();
        mers.РасходТоплива(mers.KM, 60,38.7);

        System.out.println("-------------------------");

        MERSEDES_BENZ mers1 = new MERSEDES_BENZ(CarName.LEXUS, "White", 2011, new NumberOfDoors(5),"Japan", 2.8);
        mers1.getInfo();
        mers1.makeSignal();
        mers1.РасходТоплива(100,45,36);

    }
}
