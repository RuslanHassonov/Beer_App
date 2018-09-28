package main.utility;

import main.Beer;

import java.util.ArrayList;
import java.util.Random;

import main.utility.BeerNames;

public class BeerFactory {

    private ArrayList<Beer> listOfBeers;

    public BeerFactory(){
        listOfBeers = new ArrayList<>();
        fillListOfBeers();
    }

    public ArrayList<Beer> getListOfBeers() {
        return listOfBeers;
    }

    private Beer getBeer(){
        Beer newBeer = new Beer(BeerNames.getRandomBeerName().toString());
        newBeer.setType(NamesTypeBeer.getRandomBeerType().toString());
        newBeer.setAlcoholPercentage(addAlcoholPercentage());
        return newBeer;
    }

    private void fillListOfBeers(){
        int ctr = 0;
        while (ctr <= 10){
            listOfBeers.add(getBeer());
            ctr++;
        }
    }

    private double addAlcoholPercentage(){
         double min= 5.0;
         double max = 15.0;
         double random = new Random().nextDouble();
         return min + (random * (max - min));
    }
}
