package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.vehicles.Vehicle;

public class Pilot extends Person implements Rider
{
    Boolean hasMounted;
    Boolean hasDismounted;

    public Pilot(String name){
        this.setName(name);

        this.hasMounted = false;
        this.hasDismounted = false;

    }

    public Boolean mount(Vehicle thingToBeMounted) {
        if (thingToBeMounted.ride(this)) {
            hasMounted = true;
        }
        else {
            hasMounted = false;
        }

        return hasMounted;
    }

    public Boolean dismount(Vehicle thingToBeDismounted)
    {
        if (this == thingToBeDismounted.stopRiding()) {
            hasDismounted = true;
        }
        else {
            hasDismounted = false;
        }

        return hasDismounted;
    }
}

