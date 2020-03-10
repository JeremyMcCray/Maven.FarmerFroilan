package com.zipcodewilmington.froilansfarm.storage;


import com.zipcodewilmington.froilansfarm.food.Edible;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Silo implements Storage<Edible>{

    private List<Edible> silo;

    public Silo(){
        silo = new ArrayList<Edible>();
    }

    public Silo(Edible... edibles){
        this();
        Collections.addAll(silo, edibles);
    }

    public Boolean add(Edible edibleToAdd) {
        if(!silo.contains(edibleToAdd)){
            silo.add(edibleToAdd);
            return true;
        }else
            return false;
    }

    public Boolean remove(Edible edibleToRemove) {
        if(silo.contains(edibleToRemove)){
            silo.remove(edibleToRemove);
            return true;
        }else
            return false;
    }

    public Edible get() {
        if(silo.size() != 0){
            return silo.get(0);
        }else
            return null;
    }

    public Integer size() {
        return silo.size();
    }
}
