package com.zipcodewilmington.froilansfarm.food;


public abstract class Crop implements Produce {
    Boolean hasBeenHarvested;
    Boolean hasBeenFertilized;
   public Edible yielded;

    public Boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public Boolean getHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public Boolean setHasBeenHarvested(Boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
        return hasBeenHarvested;
    }

    public Boolean setHasBeenFertilized(Boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
        return hasBeenFertilized;
    }

    public Edible getYielded() {
        return this.yielded;
    }


}