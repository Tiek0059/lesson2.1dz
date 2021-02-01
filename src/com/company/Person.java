package com.company;

public class Person implements Printable{
    private int chakry ;

    public Person(int chakry){
        this.chakry = chakry;
    }

    public int getChakry() {
        return chakry;
    }

    @Override
    public String print() {
        return getClass().getName() + "\n" + "chakry = " + getChakry();
    }
}
