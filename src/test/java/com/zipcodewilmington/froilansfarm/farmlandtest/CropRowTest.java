package com.zipcodewilmington.froilansfarm.farmlandtest;

import com.zipcodewilmington.froilansfarm.farmland.CropRow;
import com.zipcodewilmington.froilansfarm.food.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CropRowTest {


    @Test
    public void addCropToCropRowTest(){
        CropRow cropRow = new CropRow();
        Crop crop = new CarrotPlant();
        Assert.assertTrue(cropRow.addCropsToCropRow(crop));
    }

    @Test
    public void cropRowSizeTest(){
        CropRow cropRow = new CropRow();
        CornStalk cornStalk = new CornStalk();
        for (int i = 0; i < 4; i++) {
            cropRow.addCropsToCropRow(cornStalk);
        }
        int expected = 4;
        int actual = cropRow.getCropRowSize();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getCropFromCropRowTest(){
        CropRow cropRow = new CropRow();
        TomatoPlant tomatoPlant = new TomatoPlant();
        cropRow.addCropsToCropRow(tomatoPlant);
        int sizeOfCropRowAfterAdding = cropRow.getCropRowSize();
        Crop crop = cropRow.getCropFromCropRow(0);
        int sizeOfCropRowAfterGetting = cropRow.getCropRowSize();
        Assert.assertTrue(sizeOfCropRowAfterAdding == 1);
        Assert.assertTrue(sizeOfCropRowAfterGetting == 1);
        Assert.assertTrue(crop instanceof TomatoPlant);
    }


}
