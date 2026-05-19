package com.pluralsight;

public class Cash extends Asset {

    private long amount;

    public double getValue(){
        return getOriginalCost();
    }
}
