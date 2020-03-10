package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.food.Edible;

import java.util.ArrayList;

public class Chicken implements Animal{
    private Integer id;
    private ArrayList<Edible> stomach ;

    public Integer getStomachSize() {
        return stomach.size();
    }

    public Chicken(){
        this.stomach = new ArrayList<Edible>();
    }
    public Chicken(Integer id){
        this.id = id;
        this.stomach = new ArrayList<Edible>();
    }

    public Integer getId(){
        return this.id;
    }

    public void setId(Integer id){
        this.id = id;
    }


    public boolean eatFood(Edible edible) {
        int beforeMeal = this.stomach.size();
        this.stomach.add(edible);
        int afterMeal = this.stomach.size();
        if (beforeMeal < afterMeal) {
            return true;
        }
        return false;
    }
    public String makeNoise() {
        String noise = "cluck, cluck, cluck";
        return noise;
    }
}
