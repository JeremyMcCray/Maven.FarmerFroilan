package com.zipcodewilmington.froilansfarm.foodtest;

import com.zipcodewilmington.froilansfarm.food.CarrotPlant;
import com.zipcodewilmington.froilansfarm.food.Edible;
import com.zipcodewilmington.froilansfarm.food.HempPlant;
import org.junit.Assert;
import org.junit.Test;

public class CarrotPlantTest {


    CarrotPlant test = new CarrotPlant();
    private Edible carrot = test.yielded;

    @Test
    public void CarrotPlantYieldTest(){

        test.setHasBeenFertilized(true);
        test.setHasBeenHarvested(false);

        Edible expected = carrot;
        Edible actual  = test.getYielded();

        Assert.assertEquals(actual,expected);

    }

    @Test
    public void CarrotGetHarvestedTest(){
        Boolean expected = false;
        Boolean actual = test.getHasBeenHarvested();

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void CarrotGetFertilizedTest(){
        Boolean expected = false;
        Boolean actual = test.getHasBeenFertilized();

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void CarrotSetHarvestedTest(){
        test.setHasBeenHarvested(true);
        Boolean expected = true;
        Boolean actual = test.getHasBeenHarvested();

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void CarrotSetFertilizedTest(){
        test.setHasBeenFertilized(true);

        Boolean expected = true;
        Boolean actual = test.getHasBeenFertilized();

        Assert.assertEquals(actual,expected);
    }
}
