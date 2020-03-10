package com.zipcodewilmington.froilansfarm.weekdays;

import com.zipcodewilmington.froilansfarm.Farm;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DailyRoutinesTest {

    Sunday sunday;
    Farm test;

    @Before
    public void init(){
        test = new Farm();
        sunday = new Sunday(test);
    }

    @Test
    public void morningRoutine() {
        assertTrue(sunday.morningRoutine());
    }

    @Test
    public void dailyRoutine() {
        assertFalse(sunday.dailyRoutine());
    }

    @Test
    public void eveningRoutine() {
        assertFalse(sunday.eveningRoutine());
    }

    @Test
    public void eatBreakfast() {
        assertTrue(sunday.eatBreakfast());
    }

    @Test
    public void rideAndFeedHorses() {
        assertTrue(sunday.rideAndFeedHorses());
    }
}