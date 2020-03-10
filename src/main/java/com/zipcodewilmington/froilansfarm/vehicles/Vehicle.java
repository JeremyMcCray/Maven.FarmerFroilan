package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.basicactions.NoiseMaker;
import com.zipcodewilmington.froilansfarm.people.Person;

public abstract class Vehicle implements Rideable, NoiseMaker {
public boolean hasRider = false;
public Person personRidingThisVehicle;


    public Person stopRiding() {
        Person returningPerson;
        if(this.hasRider){
            this.hasRider = false;
            returningPerson = this.personRidingThisVehicle;
            this.personRidingThisVehicle = null;
            return returningPerson;
        }
        return null;
    }


}
