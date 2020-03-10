package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.farmland.CropRow;
import com.zipcodewilmington.froilansfarm.farmland.Field;
import com.zipcodewilmington.froilansfarm.food.Carrot;
import com.zipcodewilmington.froilansfarm.food.EarCorn;
import com.zipcodewilmington.froilansfarm.food.Hemp;
import com.zipcodewilmington.froilansfarm.food.Tomato;
import com.zipcodewilmington.froilansfarm.people.Farmer;
import com.zipcodewilmington.froilansfarm.storage.ChickenCoop;
import com.zipcodewilmington.froilansfarm.storage.Silo;
import com.zipcodewilmington.froilansfarm.storage.Stable;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;

public class Farm {
    public Field field;
    public Tractor tractor;
    public CropDuster cropDuster;
    public ChickenCoop coop1;
    public ChickenCoop coop2;
    public ChickenCoop coop3;
    public ChickenCoop coop4;
    public Stable stable1;
    public Stable stable2;
    public Stable stable3;
    public Silo cornSilo;
    public Silo tomatoSilo;
    public Silo carrotSilo;
    public Silo hempSilo;
    public Farmer froilan;
    public Farmer froilinda;

    public Farm() {
        field = new Field();
        tractor = new Tractor();
        cropDuster = new CropDuster();
        coop1 = new ChickenCoop();
        coop2 = new ChickenCoop();
        coop3 = new ChickenCoop();
        coop4 = new ChickenCoop();
        stable1 = new Stable();
        stable2 = new Stable();
        stable3 = new Stable();
        cornSilo = new Silo();
        tomatoSilo = new Silo();
        carrotSilo = new Silo();
        hempSilo = new Silo();
        froilan = new Farmer("Froilan");
        froilinda = new Farmer("Froilinda");

        tractor.operate(this);
        cropDuster.operate(this);

        initiateFood();
        initiateAnimals();
    }

    public Field getField() {
        return field;
    }

    public Boolean initiateAnimals(){
        for (int i = 0; i < 5; i++) {
            int rand =(int) Math.floor(Math.random()*50);
            field.addCropRowsToCropField(new CropRow());
            coop1.add(new Chicken(rand));
            rand =(int) Math.floor(Math.random()*50);
            coop2.add(new Chicken(rand));
            rand =(int) Math.floor(Math.random()*50);
            coop3.add(new Chicken(rand));
            rand =(int) Math.floor(Math.random()*50);
            if(i != 4)
                stable3.add(new Horse(rand));
        }
        for (int i = 0; i < 3; i++) {
            int rand =(int) Math.floor(Math.random()*50);
            stable1.add(new Horse(rand));
            rand =(int) Math.floor(Math.random()*50);
            stable2.add(new Horse(rand));
        }
        return true;
    }

    public Boolean initiateFood(){
        for (int i = 0; i < 50; i++) {
            cornSilo.add(new EarCorn());
            tomatoSilo.add(new Tomato());
            carrotSilo.add(new Carrot());
            hempSilo.add(new Hemp());
        }
        return true;
    }
}