package com.zipcodewilmington.froilansfarm.food;

public class CornStalk extends Crop {

    private EarCorn EarCorn = new EarCorn();

    // constructor
    public CornStalk() {
        this.hasBeenFertilized = false;
        this.hasBeenHarvested = false;
        this.yielded = EarCorn;
    }
}

