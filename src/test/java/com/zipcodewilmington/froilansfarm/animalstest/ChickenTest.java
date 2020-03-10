package com.zipcodewilmington.froilansfarm.animalstest;

import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.food.EarCorn;
import com.zipcodewilmington.froilansfarm.food.Edible;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ChickenTest {
    @Test
    public void eatFoodTest(){
        Chicken chicklil = new Chicken();
        Edible earCorn = new EarCorn();
        Assert.assertTrue(chicklil.eatFood(earCorn));
    }

    @Test
    public void makeNoiseTest(){
        Chicken chick1 = new Chicken();
        String expected = "cluck, cluck, cluck";
        String actual = chick1.makeNoise();
        Assert.assertEquals(expected, actual);





    }

    @Test
    public void chickenConstructorTest(){
        Integer givenId = 2;
        Chicken chick1 = new Chicken(givenId);
        Integer retrievedId = chick1.getId();
        Assert.assertEquals(givenId, retrievedId);


    }

    @Test
    public void setIdTest(){
        Chicken chick1 = new Chicken();
        Integer expected = 3;
        chick1.setId(expected);
        Integer actual = chick1.getId();
        Assert.assertEquals(expected, actual);

    }


}
