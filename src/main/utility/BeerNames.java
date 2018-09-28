package main.utility;

import java.util.Random;

public enum BeerNames {
    STELLA_ARTOIS("Stella Artois"),
    JUPILER("Jupiler"),
    DUVEL("Duvel"),
    ZWET_BE("Zwet.be"),
    TRIPLE_KARMELIET("Triple Karmeliet"),
    PALM_ROYAL("Palm Royal");

    private String nameOfBeer;

    private BeerNames(String nameOfBeer){
        this.nameOfBeer = nameOfBeer;
    }

    public static BeerNames getRandomBeerName() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

    public String toString(){
        return this.nameOfBeer;
    }
}
