package com.zipcodewilmington.froilansfarm.vehiclestest;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.farmland.CropRow;
import com.zipcodewilmington.froilansfarm.farmland.Field;
import com.zipcodewilmington.froilansfarm.food.CornStalk;
import com.zipcodewilmington.froilansfarm.people.Pilot;
import com.zipcodewilmington.froilansfarm.vehicles.*;
import org.junit.Assert;
import org.junit.Test;

public class CropDusterTest {

    Pilot jeff = new Pilot("JeffFriend");

    @Test
    public void instanceOfVehicleTest(){
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster instanceof Vehicle);
        Assert.assertTrue(cropDuster instanceof FarmVehicle);
        Assert.assertTrue(cropDuster instanceof Aircraft);
    }

    @Test
    public void makeNoiseTest(){
        CropDuster cropDuster = new CropDuster();
        String expected = "putt putt putt putt";
        String actual = cropDuster.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void rideTest(){
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster.ride(jeff));
    }

    @Test
    public void stopRidingTest(){
        CropDuster cropDuster = new CropDuster();
        cropDuster.ride(jeff);
        Assert.assertTrue(jeff == cropDuster.stopRiding());
    }

    @Test
    public void flyTest(){
        CropDuster cropDuster = new CropDuster();
        cropDuster.ride(jeff);
        cropDuster.fly();
        Assert.assertTrue(cropDuster.isFlying());
    }

    @Test
    public void stopFlyingTest(){
        CropDuster cropDuster = new CropDuster();
        cropDuster.ride(jeff);
        cropDuster.fly();
        cropDuster.land();
        cropDuster.stopRiding();
        Assert.assertFalse(cropDuster.isFlying());
    }

    @Test
    public void operateTest(){
        CropDuster cropDuster = new CropDuster();
        Farm farm = new Farm();
        CropRow cropRow1 = new CropRow();
        CornStalk cornStalk = new CornStalk();
        cropRow1.addCropsToCropRow(cornStalk);
        farm.getField().addCropRowsToCropField(cropRow1);
        cropDuster.ride(jeff);
        cropDuster.fly();
        cropDuster.operate(farm);
        Assert.assertTrue(cropRow1.getCropFromCropRow(0).getHasBeenFertilized());
        Assert.assertEquals(6, farm.getField().amountOfCropRowsInField());
    }


}
