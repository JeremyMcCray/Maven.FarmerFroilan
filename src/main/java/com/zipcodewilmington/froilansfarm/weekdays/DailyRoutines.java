package com.zipcodewilmington.froilansfarm.weekdays;
import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.console.Console;
import com.zipcodewilmington.froilansfarm.people.Farmer;

import java.util.logging.Logger;

public abstract class DailyRoutines {

    private String day;
    private Farm farm;
    private Console console = new Console(System.in, System.out);

    public DailyRoutines(Farm farm){
        this.farm = farm;
    }

    public Boolean morningRoutine(){
        console.printNewDay(this.getClass().getSimpleName());
        eatBreakfast();
        rideAndFeedHorses();
        return true;
    }

    public Boolean dailyRoutine(){
        return false;
    }

    public Boolean eveningRoutine(){
        return false;
    }

    public Boolean eatBreakfast(){
        console.printBreakfast(farm.froilan.getName(), 1, 2, 5);
        console.printBreakfast(farm.froilinda.getName(), 2, 1, 2);
        return true;
    }

    public Boolean rideAndFeedHorses(){
        for (int i = 0; i < 3; i++) {
            Horse horse1 = farm.stable1.get();
            Horse horse2 = farm.stable2.get();
            Farmer farmer1 = farm.froilan;
            Farmer farmer2 = farm.froilinda;

            farmer1.mount(horse1);
            farm.stable1.remove(horse1);
            console.printHorseRide(farmer1.getName(), "" + horse1.getId());
            console.printFeedHorses(farmer1.getName(), "" + horse1.getId());
            farmer1.dismount(horse1);
            farm.stable1.add(horse1);

            farmer2.mount(horse2);
            farm.stable2.remove(horse2);
            console.printHorseRide(farmer2.getName(), "" + horse2.getId());
            console.printFeedHorses(farmer2.getName(), "" + horse2.getId());
            farmer2.dismount(horse2);
            farm.stable2.add(horse2);
        }
        for (int i = 0; i < 2; i++) {
            Horse horse1 = farm.stable3.get();
            farm.stable3.remove(horse1);
            Horse horse2 = farm.stable3.get();
            farm.stable3.remove(horse2);
            Farmer farmer1 = farm.froilan;
            Farmer farmer2 = farm.froilinda;

            console.printHorseRide(farmer1.getName(), "" + horse1.getId());
            console.printFeedHorses(farmer1.getName(), "" + horse1.getId());
            farmer1.dismount(horse1);
            farm.stable3.add(horse1);
            farmer2.mount(horse2);

            console.printHorseRide(farmer2.getName(), "" + horse2.getId());
            console.printFeedHorses(farmer2.getName(), "" + horse2.getId());
            farmer2.dismount(horse2);
            farm.stable3.add(horse2);
        }
        return true;
    }

}
