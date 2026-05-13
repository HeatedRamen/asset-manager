package com.pluralsight;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Asset> investments = new ArrayList<>();

        investments.add(new House("Mansion", "01/01/26", 250000, "123 Street Rd.", 4, 10000, 500));
        investments.add(new House("Shack", "01/02/26", 10000, "1234 Road St.", 2, 500, 10));
        investments.add(new Vehicle("Coupe", "01/03/26", 55000, "Dodge Challenger", 2026, 100));
        investments.add(new Vehicle("SUV", "12/20/20", 100000, "KIA Soul", 2002, 501234));

        for (Asset asset : investments){
            if (asset instanceof House){
                System.out.println((House)asset);
            }else if (asset instanceof Vehicle){
                System.out.println((Vehicle)asset);
            } else {
                System.out.println(asset);
            }
        }
    }
}
