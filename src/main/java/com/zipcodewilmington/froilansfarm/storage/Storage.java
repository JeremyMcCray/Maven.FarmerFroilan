package com.zipcodewilmington.froilansfarm.storage;

public interface Storage <T>{

    public Boolean add(T obj);

    public Boolean remove(T obj);

    public T get();

    public Integer size();
}
