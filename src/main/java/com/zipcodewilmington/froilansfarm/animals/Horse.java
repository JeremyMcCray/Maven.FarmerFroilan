package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.food.Edible;
import com.zipcodewilmington.froilansfarm.people.Person;
import com.zipcodewilmington.froilansfarm.vehicles.Vehicle;

import java.util.ArrayList;

public class Horse extends Vehicle implements Animal {
    private Integer id;
    private ArrayList<Edible> stomach ;



    public Integer getStomachSize() {
        return stomach.size();
    }



    public Horse() {
        this.stomach = new ArrayList<Edible>();
    }

    public Horse(Integer id){
        this.id = id;
        this.stomach = new ArrayList<Edible>();
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean eatFood(Edible edible){
        int beforeMeal = this.stomach.size();
        this.stomach.add(edible);
        int afterMeal = this.stomach.size();
        if(beforeMeal < afterMeal){
            return true;
        }
        return false;

    }
    public String makeNoise() {
        String noise = "neigh, snort";
        return noise;
    }

    public boolean ride(Person person) {
        if(!this.hasRider && personRidingThisVehicle == null){
            this.hasRider = true;
            personRidingThisVehicle = person;
            return true;
        }
        return false;
    }
}
