package com.zipcodewilmington.froilansfarm.food;

public class HempPlant extends Crop {

    private Hemp hemp = new Hemp();

    public HempPlant() {
        this.hasBeenFertilized = false;
        this.hasBeenHarvested = false;
        this.yielded = hemp;
    }
}
