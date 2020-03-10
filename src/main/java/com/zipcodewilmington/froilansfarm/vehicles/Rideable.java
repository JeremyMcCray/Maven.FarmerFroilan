package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.people.Person;

public interface Rideable {
    boolean ride(Person person);
    Person stopRiding();
}
