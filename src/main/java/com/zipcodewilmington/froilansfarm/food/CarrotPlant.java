package com.zipcodewilmington.froilansfarm.food;

public class CarrotPlant extends Crop {

    private Carrot carrot = new Carrot();

    public CarrotPlant(){
        this.hasBeenFertilized = false;
        this.hasBeenHarvested = false;
        this.yielded = carrot;
    }
}
