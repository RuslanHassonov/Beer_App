package main.utility;

import java.util.Random;

public enum NamesTypeBeer {
    PORTER("Porter/Stout"), //type 1
    PILSNER("Pilsner"), //type 2
    AMBER("Amber"), //type 3
    BLOND("Blond"), //type 4
    Bruin("Bruin"); //type 5

    private String nameOfType;

    private NamesTypeBeer(String nameOfType){
        this.nameOfType = nameOfType;
    }

    public static NamesTypeBeer getRandomBeerType() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

    public String toString(){
        return this.nameOfType;
    }
}
