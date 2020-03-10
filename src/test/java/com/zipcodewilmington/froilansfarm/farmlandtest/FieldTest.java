package com.zipcodewilmington.froilansfarm.farmlandtest;

import com.zipcodewilmington.froilansfarm.farmland.CropRow;
import com.zipcodewilmington.froilansfarm.farmland.Field;
import org.junit.Assert;
import org.junit.Test;

public class FieldTest {

    @Test
    public void testAddCropRows(){
        Field field = new Field();
        CropRow cropRow = new CropRow();
        Assert.assertTrue(field.addCropRowsToCropField(cropRow));
    }

    @Test
    public void testGetCropRow(){
        Field field = new Field();
        Assert.assertTrue(field.getCropRowsInField().isEmpty());

    }


}
