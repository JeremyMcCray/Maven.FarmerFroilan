package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.weekdays.Sunday;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplication {

    public static void main(String[] args) {
        Farm test = new Farm();
        Sunday t = new Sunday(test);
        t.morningRoutine();
    }
}
