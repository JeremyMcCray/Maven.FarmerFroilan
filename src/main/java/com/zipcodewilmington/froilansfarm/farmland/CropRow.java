package com.zipcodewilmington.froilansfarm.farmland;

import com.zipcodewilmington.froilansfarm.food.Crop;
import java.util.ArrayList;

public class CropRow {
    ArrayList<Crop> cropRow;

    public CropRow() {
        this.cropRow = new ArrayList<Crop>();
    }

    public int getCropRowSize() {
        return cropRow.size();
    }

    public boolean addCropsToCropRow(Crop crop){
        int preAddingCrops = cropRow.size();
        cropRow.add(crop);
        if(preAddingCrops < cropRow.size()){
            return true;
        }
        return false;
    }

    public Crop getCropFromCropRow(int index){
       return cropRow.get(index);
    }

    public ArrayList<Crop> getCropRow() {
        return cropRow;
    }
}
