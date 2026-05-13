package com.pluralsight;

public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private int odometer;

    Vehicle(){
        super();
        makeModel = "";
        year = 0;
        odometer = 0;
    }

    Vehicle (String description, String dateAcquired, double originalPrice, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalPrice);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;

    }
    public String getMakeModel() { return makeModel; }
    public void setMakeModel(String makeModel) { this.makeModel = makeModel;}

    public int getOdometer() { return odometer; }
    public void setOdometer(int odometer) { this.odometer = odometer; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    @Override
    public double getValue(){

        double valueMultiple = 1;

        if (year > 10){
            return 1000;
        } else if (year >= 7 && year <= 10) {
            valueMultiple = 0.92;
        } else if (year >= 4 && year <= 6){
            valueMultiple = 0.94;
        } else if (year <= 3) {
            valueMultiple = 0.97;
        } else {
            // how did you get here
        }

        if (odometer > 100000 &&
                !makeModel.equalsIgnoreCase("Honda") &&
                !makeModel.equalsIgnoreCase("Toyota")){
            valueMultiple -= .25;
        }
        return getOriginalCost() * valueMultiple;
    }

    @Override
    public String toString() {
        return "Make/Model: " + makeModel + " Price: " + getOriginalCost() + " Odometer miles: " + odometer;
    }
}
