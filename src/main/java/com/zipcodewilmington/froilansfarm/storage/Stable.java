package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.animals.Horse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stable implements Storage<Horse>{

    private List<Horse> stable;

    public Stable(){
        stable = new ArrayList<Horse>();
    }

    public Stable(Horse... horses){
        this();
        Collections.addAll(stable, horses);
    }

    public Boolean add(Horse horseToAdd) {
        if(!stable.contains(horseToAdd)){
            stable.add(horseToAdd);
            return true;
        }else
            return false;
    }

    public Boolean remove(Horse horseToRemove) {
        if(stable.contains(horseToRemove)){
            stable.remove(horseToRemove);
            return true;
        }else
            return false;
    }

    public Horse get() {
        if(stable.size() != 0){
            return stable.get(0);
        }else
            return null;
    }

    public Integer size() {
        return stable.size();
    }
}
