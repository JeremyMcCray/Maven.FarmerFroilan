package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.farmland.CropRow;
import com.zipcodewilmington.froilansfarm.farmland.Field;
import com.zipcodewilmington.froilansfarm.food.*;
import com.zipcodewilmington.froilansfarm.vehicles.Vehicle;

import java.util.ArrayList;

public class Farmer extends Person implements Rider, Botanist
{
    Farm farmOwned;
    Boolean harvestEgg;
    Boolean hasMounted;
    Boolean hasDismounted;
    Boolean hasPlanted;

    public Farmer(String name){
        this.setName(name);
        this.harvestEgg = false;
        this.hasMounted = false;
        this.hasDismounted = false;
        this.hasPlanted = false;
    }

    public Boolean harvestEgg(ArrayList<Egg> eggsHarvested) {
        Egg harvestedEgg = new Egg();
        for (int i = 0; i < 15; i++) {
            eggsHarvested.add(0, harvestedEgg);

        }
        return harvestEgg;
    }



    public Boolean mount(Vehicle thingToBeMounted) {
        if (thingToBeMounted.ride(this)) {
            hasMounted = true;
        }
        else {
            hasMounted = false;
        }

        return hasMounted;
    }

    public Boolean dismount(Vehicle thingToBeDismounted)
    {
        if (this == thingToBeDismounted.stopRiding()) {
            hasDismounted = true;
        }
        else {
            hasDismounted = false;
        }

        return hasDismounted;
    }

//    public ArrayList<CropRow> plant(int cropRowYouWantToWorkOn, Crop cropYouWantToPlant) {
//        CropRow newRow = new CropRow();
//        ArrayList<CropRow> plantRow = new ArrayList<CropRow>();
//        newRow.getCropRow().add(cropRowYouWantToWorkOn, cropYouWantToPlant);
//
//        plantRow.add(newRow);
//        return plantRow;
//
//    }

    public int plant(CropRow cropRow, Crop cropYouWantToPlant) {
        for (int i = 0; i < 40; i++) {
            cropRow.addCropsToCropRow(cropTypeChecker(cropYouWantToPlant));
        }
        int afterAfterPlanting = cropRow.getCropRowSize();
        return afterAfterPlanting;
    }

    public Crop cropTypeChecker(Crop cropToBeChecked){
        if(cropToBeChecked instanceof CornStalk){
            CornStalk corn = new CornStalk();
            return corn;
        } else if(cropToBeChecked instanceof TomatoPlant){
            TomatoPlant tomatoPlant = new TomatoPlant();
            return tomatoPlant;
        } else if(cropToBeChecked instanceof HempPlant){
            HempPlant hempPlant = new HempPlant();
            return hempPlant;
        } else if(cropToBeChecked instanceof CarrotPlant){
            CarrotPlant carrotPlant = new CarrotPlant();
            return carrotPlant;
        }
        return null;
    }
}
