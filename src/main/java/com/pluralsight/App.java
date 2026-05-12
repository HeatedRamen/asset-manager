package com.pluralsight;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Asset> investments = new ArrayList<>();

        investments.add(new House());
        investments.add(new House());
        investments.add(new Vehicle());
        investments.add(new Vehicle());

    }
}
