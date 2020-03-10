package com.zipcodewilmington.froilansfarm.food;

public class TomatoPlant extends Crop {

    private Tomato tomato = new Tomato();

    public TomatoPlant() {
        this.hasBeenFertilized = false;
        this.hasBeenHarvested = false;
        this.yielded = tomato;
    }



}
