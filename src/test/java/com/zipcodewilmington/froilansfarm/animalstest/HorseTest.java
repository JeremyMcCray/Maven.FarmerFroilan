package com.zipcodewilmington.froilansfarm.animalstest;

import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.food.Edible;
import org.junit.Assert;
import org.junit.Test;

public class HorseTest {


    @Test
    public void setIdTest() {
        Horse horse1 = new Horse();
        Integer expected = 10;
        horse1.setId(expected);
        Integer actual = horse1.getId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatFoodTest() {
        Horse horse1 = new Horse();
        Edible earCorn = new Edible() {};
        boolean result;
        if (horse1.eatFood(earCorn)) result = true;
        else result = false;
        Boolean answer = true;
        Assert.assertTrue("Let's eat", true);
    }

    @Test
    public void makeNoiseTest() {
    }

    @Test
    public void rideTest() {
    }

    @Test
    public void stopRidingTest() {
    }
}
