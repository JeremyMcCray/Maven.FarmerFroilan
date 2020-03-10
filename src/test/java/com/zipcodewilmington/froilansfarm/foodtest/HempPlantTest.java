package com.zipcodewilmington.froilansfarm.foodtest;

import com.zipcodewilmington.froilansfarm.food.CornStalk;
import com.zipcodewilmington.froilansfarm.food.Edible;
import com.zipcodewilmington.froilansfarm.food.HempPlant;
import org.junit.Assert;
import org.junit.Test;

public class HempPlantTest {

    HempPlant test = new HempPlant();
    private Edible Hemp = test.yielded;

    @Test
    public void HempPlantYieldTest(){

        test.setHasBeenFertilized(true);
        test.setHasBeenHarvested(false);

        Edible expected = Hemp;
        Edible actual  = test.getYielded();

        Assert.assertEquals(actual,expected);

    }


    @Test
    public void HempGetHarvestedTest(){
        Boolean expected = false;
        Boolean actual = test.getHasBeenHarvested();

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void HempGetFertilizedTest(){
        Boolean expected = false;
        Boolean actual = test.getHasBeenFertilized();

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void HempSetHarvestedTest(){
        test.setHasBeenHarvested(true);
        Boolean expected = true;
        Boolean actual = test.getHasBeenHarvested();

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void HempSetFertilizedTest(){
        test.setHasBeenFertilized(true);

        Boolean expected = true;
        Boolean actual = test.getHasBeenFertilized();

        Assert.assertEquals(actual,expected);
    }
}
