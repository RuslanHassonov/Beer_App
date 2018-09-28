package main;

import main.utility.BeerFactory;

public class Main {

    public static void main(String[] args) {

        BeerFactory makingBeer = new BeerFactory();

        for (Beer b: makingBeer.getListOfBeers()) {
            System.out.printf("%nBeer name: %s%n   - Type: %s%n   -   AP: %%%.1f%n", b.getName(),b.getType(), b.getAlcoholPercentage());
        }
    }
}
