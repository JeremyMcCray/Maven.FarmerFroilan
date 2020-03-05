package com.zipcodewilmington.froilansfarm.storagetest;

import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.storage.ChickenCoop;
import com.zipcodewilmington.froilansfarm.storage.Stable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class ChickenCoopTest {
    ChickenCoop testCoop;
    Chicken testChicken;

    @Before
    public void init(){
        testCoop = new ChickenCoop();
        testChicken = new Chicken();
    }

    @Test
    public void constructorTest(){
        testCoop = new ChickenCoop(testChicken);
        Integer expected = 1;

        Integer actual = testCoop.size();

        assertEquals(expected, actual);
    }

    @Test
    public void addTest(){
        Boolean actual = testCoop.add(testChicken);

        assertTrue(actual);
    }

    @Test
    public void addTest2(){
        testCoop.add(testChicken);

        Boolean actual = testCoop.add(testChicken);

        assertFalse(actual);
    }

    @Test
    public void removeTest(){
        Boolean actual = testCoop.remove(testChicken);

        assertFalse(actual);
    }

    @Test
    public void removeTest2(){
        testCoop.add(testChicken);
        Boolean actual = testCoop.remove(testChicken);

        assertTrue(actual);
    }

    @Test
    public void sizeTest(){
        Integer expected = 0;

        Integer actual = testCoop.size();

        assertEquals(expected, actual);
    }

    @Test
    public void sizeTest2(){
        Integer expected = 1;
        testCoop.add(testChicken);

        Integer actual = testCoop.size();

        assertEquals(expected, actual);
    }

    @Test
    public void getTest(){
        testCoop.add(testChicken);

        Chicken actual = testCoop.get();

        assertEquals(testChicken, actual);
    }
}
