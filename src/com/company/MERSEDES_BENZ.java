package com.company;

public final class MERSEDES_BENZ extends Car {
    private double ОбъёмДвигателя;

    public MERSEDES_BENZ(CarName name, String color, int year, NumberOfDoors numberOfDoors, String whichCountryfrom, double объёмДвигателя) {
        super(name,color, year, numberOfDoors, whichCountryfrom);
        this.ОбъёмДвигателя = объёмДвигателя;
    }

    public double getОбъёмДвигателя(){
        return ОбъёмДвигателя;
    }

    @Override
    public void makeSignal() {
        System.out.println("paap-paap");
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Объём двигателя: " + ОбъёмДвигателя);
    }
}
