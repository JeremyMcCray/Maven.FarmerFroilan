package com.zipcodewilmington.froilansfarm.animalstest;

import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.food.EarCorn;
import com.zipcodewilmington.froilansfarm.food.Edible;
import com.zipcodewilmington.froilansfarm.people.Farmer;
import com.zipcodewilmington.froilansfarm.vehicles.Vehicle;
import org.junit.Assert;
import org.junit.Test;

public class HorseTest {
Farmer joe = new Farmer("Jeff");

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
        Edible earCorn = new EarCorn();
        Assert.assertTrue(horse1.eatFood(earCorn));
    }

    @Test
    public void makeNoiseTest() {
        Horse horse1 = new Horse();
        String expected = "neigh, snort";
        String actual = horse1.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void rideTest() {
        Horse trigger = new Horse();
        Assert.assertTrue(trigger.ride(joe));
    }

    @Test
    public void stopRidingTest() {
        Horse seabiscuit = new Horse();
        seabiscuit.ride(joe);
        Assert.assertTrue(joe == seabiscuit.stopRiding());
    }


}