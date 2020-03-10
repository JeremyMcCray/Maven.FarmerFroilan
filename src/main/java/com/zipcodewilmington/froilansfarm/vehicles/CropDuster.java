package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.farmland.CropRow;
import com.zipcodewilmington.froilansfarm.food.Crop;
import com.zipcodewilmington.froilansfarm.people.Person;
import com.zipcodewilmington.froilansfarm.people.Pilot;

public class CropDuster extends Vehicle implements FarmVehicle, Aircraft {
    boolean isFlying = false;

    public CropDuster() {
    }

    public String makeNoise() {
        return "putt putt putt putt";
    }

    public void fly() {
        if(this.hasRider){
            if(!this.isFlying){
                this.isFlying = true;
            }
        }
    }

    public void land(){
        if(this.isFlying){
            this.isFlying = false;
        }
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void operate(Farm farm) {
        if(this.isFlying && this.hasRider){
            for (CropRow cropRow: farm.getField().getCropRowsInField()) {
                for (Crop crop :cropRow.getCropRow()) {
                    crop.setHasBeenFertilized(true);
                }
            }
        }
    }

    public boolean ride(Person person) {
        if(!this.hasRider && personRidingThisVehicle == null && person instanceof Pilot){
            this.hasRider = true;
            personRidingThisVehicle = person;
            return true;
        }
        return false;
    }

}
