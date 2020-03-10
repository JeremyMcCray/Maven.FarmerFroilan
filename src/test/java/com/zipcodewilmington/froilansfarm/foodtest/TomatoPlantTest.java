package com.zipcodewilmington.froilansfarm.foodtest;

import com.zipcodewilmington.froilansfarm.food.Edible;
import com.zipcodewilmington.froilansfarm.food.HempPlant;
import com.zipcodewilmington.froilansfarm.food.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

public class TomatoPlantTest {

    TomatoPlant test = new TomatoPlant();
    private Edible tomato = test.yielded;

    @Test
    public void TomatoPlantYieldTest(){

        test.setHasBeenFertilized(true);
        test.setHasBeenHarvested(false);

        Edible expected = tomato;
        Edible actual  = test.getYielded();

        Assert.assertEquals(actual,expected);

    }


    @Test
    public void TomatoGetHarvestedTest(){
        Boolean expected = false;
        Boolean actual = test.getHasBeenHarvested();

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void TomatoGetFertilizedTest(){
        Boolean expected = false;
        Boolean actual = test.getHasBeenFertilized();

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void TomatoSetHarvestedTest(){
        test.setHasBeenHarvested(true);
        Boolean expected = true;
        Boolean actual = test.getHasBeenHarvested();

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void TomatoSetFertilizedTest(){
        test.setHasBeenFertilized(true);

        Boolean expected = true;
        Boolean actual = test.getHasBeenFertilized();

        Assert.assertEquals(actual,expected);
    }
}
