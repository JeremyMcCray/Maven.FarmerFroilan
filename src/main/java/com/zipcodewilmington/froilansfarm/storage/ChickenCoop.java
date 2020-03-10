package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.animals.Chicken;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChickenCoop implements Storage<Chicken>{

    private List<Chicken> chickenCoop;

    public ChickenCoop(){
        chickenCoop = new ArrayList<Chicken>();
    }

    public ChickenCoop(Chicken... chickens){
        this();
        Collections.addAll(chickenCoop, chickens);
    }

    public Boolean add(Chicken chickenToAdd) {
        if(!chickenCoop.contains(chickenToAdd)){
            chickenCoop.add(chickenToAdd);
            return true;
        }else
            return false;
    }

    public Boolean remove(Chicken chickenToRemove) {
        if(chickenCoop.contains(chickenToRemove)){
            chickenCoop.remove(chickenToRemove);
            return true;
        }else
            return false;
    }

    public Chicken get() {
        if(chickenCoop.size() != 0){
            return chickenCoop.get(0);
        }else
            return null;
    }

    public Integer size() {
        return chickenCoop.size();
    }
}
