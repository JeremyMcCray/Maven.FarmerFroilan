package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.farmland.CropRow;
import com.zipcodewilmington.froilansfarm.farmland.Field;
import com.zipcodewilmington.froilansfarm.food.Crop;
import com.zipcodewilmington.froilansfarm.food.Edible;
import com.zipcodewilmington.froilansfarm.people.Person;

import java.util.ArrayList;

public class Tractor extends Vehicle implements FarmVehicle {
    ArrayList<Edible> tractorStorageBin;
    boolean operatingOnFarm;
    Field fieldCurrentlyBeingWorkedOn;


    public Tractor() {
        this.tractorStorageBin = new ArrayList<Edible>();
        this.operatingOnFarm = false;
    }

    public String makeNoise() {
        return "KlunkaKlunka";
    }

    public void operate(Farm farm){
        if(this.hasRider){
            this.operatingOnFarm = true;
            this.fieldCurrentlyBeingWorkedOn = farm.getField();
        }
    }

    public boolean isOperatingOnFarm() {
        return operatingOnFarm;
    }

    public ArrayList<Edible> harvest() {
        if(operatingOnFarm){
            for (CropRow cropRow : fieldCurrentlyBeingWorkedOn.getCropRowsInField()) {
                for (Crop crop : cropRow.getCropRow()) {
                    if(crop.getHasBeenFertilized() && !crop.getHasBeenHarvested()){
                        tractorStorageBin.add(crop.getYielded());
                        crop.setHasBeenHarvested(true);
                        crop.setHasBeenFertilized(false);
                    }
                }
            }
        }
        return this.tractorStorageBin;
    }

    public boolean ride(Person person) {
        if(!this.hasRider && personRidingThisVehicle == null){
            this.hasRider = true;
            personRidingThisVehicle = person;
            return true;
        }
        return false;
    }

}
