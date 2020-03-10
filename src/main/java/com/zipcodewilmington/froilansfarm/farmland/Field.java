package com.zipcodewilmington.froilansfarm.farmland;

import java.util.ArrayList;

public class Field {
    ArrayList<CropRow> cropRowsInField;

    public Field() {
        this.cropRowsInField = new ArrayList<CropRow>();
    }

    public ArrayList<CropRow> getCropRowsInField() {
        return this.cropRowsInField;
    }

    public boolean addCropRowsToCropField(CropRow cropRow){
        int preAddingCropRows = cropRowsInField.size();
        cropRowsInField.add(cropRow);
        if(preAddingCropRows < cropRowsInField.size()){
            return true;
        }
        return false;
    }

    public int amountOfCropRowsInField(){
        return cropRowsInField.size();
    }
}
