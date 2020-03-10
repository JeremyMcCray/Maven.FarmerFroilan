package com.zipcodewilmington.froilansfarm.foodtest;

import com.zipcodewilmington.froilansfarm.food.CornStalk;
import com.zipcodewilmington.froilansfarm.food.EarCorn;
import com.zipcodewilmington.froilansfarm.food.Edible;
import org.junit.Assert;
import org.junit.Test;

public class CornStalkTest {
    CornStalk test = new CornStalk();
    private Edible EarCorn = test.yielded;

    @Test
    public void cornStalkYieldTest(){

        test.setHasBeenFertilized(true);
        test.setHasBeenHarvested(false);

        Edible expected = EarCorn;
        Edible actual  = test.getYielded();

        Assert.assertEquals(actual,expected);

    }

    @Test
    public void CornGetHarvestedTest(){
        Boolean expected = false;
        Boolean actual = test.getHasBeenHarvested();

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void CornGetFertilizedTest(){
        Boolean expected = false;
        Boolean actual = test.getHasBeenFertilized();

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void CornSetHarvestedTest(){
        test.setHasBeenHarvested(true);
        Boolean expected = true;
        Boolean actual = test.getHasBeenHarvested();

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void CornSetFertilizedTest(){
        test.setHasBeenFertilized(true);

        Boolean expected = true;
        Boolean actual = test.getHasBeenFertilized();

        Assert.assertEquals(actual,expected);
    }

}
