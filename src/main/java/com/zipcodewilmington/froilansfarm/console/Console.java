package com.zipcodewilmington.froilansfarm.console;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public final class Console {
    private final Scanner input;
    private final PrintStream output;

    public Console(InputStream in, PrintStream out) {
        this.input = new Scanner(in);
        this.output = out;
    }

    public void print(String val, Object... args) {
        output.format(val, args);
    }

    public void println(String val, Object... vals) {
        print(val + "\n", vals);
    }

    public void printlnS(String val, Object... vals) {
        System.out.println(val);
    }

    public String getStringInput(String prompt, Object... args) {
        println(prompt, args);
        return input.nextLine();
    }

    public String getStringInputWithoutln(String prompt, Object... args) {
        print(prompt, args);
        return input.nextLine();
    }

    public Long getLongInput(String prompt, Object... args) {
        String stringInput = getStringInput(prompt, args);
        try {
            Long longInput = Long.parseLong(stringInput);
            return longInput;
        } catch (NumberFormatException nfe) { // TODO - Eliminate recursive nature
            println("[ %s ] is an invalid user input!", stringInput);
            println("Try inputting an integer value!");
            return getLongInput(prompt, args);
        }
    }

    public Integer getIntegerInput(String prompt, Object... args) {
        return getLongInput(prompt, args).intValue();
    }

    public void pressEnterToCount(){
        getStringInputWithoutln("press enter to continue");
    }

    public void printNewDay(String day){
        System.out.printf("It's %s! A brand new day!\n", day);
    }

    public void printHorseRide(String farmer, String horse){
        System.out.printf("%s took horse %s out for a ride.\n", farmer, horse);
    }

    public void printFeedHorses(String farmer, String horse){
        System.out.printf("%s fed horse %s 3 ear of corn.\n",farmer, horse);
    }

    public void printBreakfast(String farmer, int corn, int tomato, int eggs){
        System.out.printf("%s eats %d EarCorn %d Tomoato and %d Egg.\n", farmer, corn, tomato, eggs);
    }
}
