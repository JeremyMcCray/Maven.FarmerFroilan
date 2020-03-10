package com.zipcodewilmington.froilansfarm.storagetest;

import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.people.Farmer;
import com.zipcodewilmington.froilansfarm.people.Person;
import com.zipcodewilmington.froilansfarm.storage.FarmHouse;
import com.zipcodewilmington.froilansfarm.storage.Stable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class FarmHouseTest {

    FarmHouse testHouse;
    Person testPerson;

    @Before
    public void init(){
        testHouse = new FarmHouse();
        testPerson = new Farmer("Jeff");
    }

    @Test
    public void constructorTest(){
        testHouse = new FarmHouse(testPerson);
        Integer expected = 1;

        Integer actual = testHouse.size();

        assertEquals(expected, actual);
    }

    @Test
    public void addTest(){
        Boolean actual = testHouse.add(testPerson);

        assertTrue(actual);
    }

    @Test
    public void addTest2(){
        testHouse.add(testPerson);

        Boolean actual = testHouse.add(testPerson);

        assertFalse(actual);
    }

    @Test
    public void removeTest(){
        Boolean actual = testHouse.remove(testPerson);

        assertFalse(actual);
    }

    @Test
    public void removeTest2(){
        testHouse.add(testPerson);
        Boolean actual = testHouse.remove(testPerson);

        assertTrue(actual);
    }

    @Test
    public void sizeTest(){
        Integer expected = 0;

        Integer actual = testHouse.size();

        assertEquals(expected, actual);
    }

    @Test
    public void sizeTest2(){
        Integer expected = 1;
        testHouse.add(testPerson);

        Integer actual = testHouse.size();

        assertEquals(expected, actual);
    }

    @Test
    public void getTest(){
        testHouse.add(testPerson);

        Person actual = testHouse.get();

        assertEquals(testPerson, actual);
    }
}
