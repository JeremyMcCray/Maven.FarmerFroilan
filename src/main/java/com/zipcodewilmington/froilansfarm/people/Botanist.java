package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.farmland.CropRow;
import com.zipcodewilmington.froilansfarm.farmland.Field;
import com.zipcodewilmington.froilansfarm.food.Crop;

import java.util.ArrayList;

public interface Botanist
{
//    ArrayList<CropRow> plant(int cropRowYouWantToWorkOn, Crop cropYouWantToPlant);

    int plant(CropRow cropRow, Crop cropYouWantToPlant);
}
