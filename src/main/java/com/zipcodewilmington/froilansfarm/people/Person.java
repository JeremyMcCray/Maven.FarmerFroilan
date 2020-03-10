package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.food.Edible;

import java.util.ArrayList;

public abstract class Person
{
    private String name;

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public ArrayList<Edible> edibleFood()
    {
        return null;
    }
}
