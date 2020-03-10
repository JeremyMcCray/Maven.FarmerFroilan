package com.zipcodewilmington.froilansfarm.storagetest;

import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.food.EarCorn;
import com.zipcodewilmington.froilansfarm.food.Edible;
import com.zipcodewilmington.froilansfarm.food.Egg;
import com.zipcodewilmington.froilansfarm.food.Tomato;
import com.zipcodewilmington.froilansfarm.storage.Silo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class SiloTest {

    Silo testSilo;
    Edible testTomato;
    Edible testEgg;
    Edible testCorn;
    Edible[] testEdible;

    @Before
    public void init(){
        testSilo = new Silo();
        testTomato = new Tomato();
        testEgg = new Egg();
        testCorn = new EarCorn();
        testEdible = new Edible[]{testTomato, testEgg, testCorn};
    }

    @Test
    public void constructorTest(){
        testSilo = new Silo(testEdible);
        Integer expected = 3;

        Integer actual = testSilo.size();

        assertEquals(expected, actual);
    }

    @Test
    public void addTest(){
        Boolean actual = testSilo.add(testTomato);

        assertTrue(actual);
    }

    @Test
    public void addTest2(){
        testSilo.add(testTomato);

        Boolean actual = testSilo.add(testTomato);

        assertFalse(actual);
    }

    @Test
    public void removeTest(){
        Boolean actual = testSilo.remove(testTomato);

        assertFalse(actual);
    }

    @Test
    public void removeTest2(){
        testSilo.add(testTomato);
        Boolean actual = testSilo.remove(testTomato);

        assertTrue(actual);
    }

    @Test
    public void sizeTest(){
        Integer expected = 0;

        Integer actual = testSilo.size();

        assertEquals(expected, actual);
    }

    @Test
    public void sizeTest2(){
        Integer expected = 1;
        testSilo.add(testTomato);

        Integer actual = testSilo.size();

        assertEquals(expected, actual);
    }

    @Test
    public void getTest(){
        testSilo.add(testCorn);

        Edible actual = testSilo.get();

        assertEquals(testCorn, actual);
    }
}
