package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.vehicles.Vehicle;

public interface Rider
{
    Boolean mount(Vehicle thingToBeMounted);

    Boolean dismount(Vehicle thingToBeDismounted);
}
