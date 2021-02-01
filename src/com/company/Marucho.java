package com.company;

public class Marucho extends Person implements Printable{
    private int derevo;

    public Marucho(int chakry,int derevo ){
        super(chakry);
        this.derevo = derevo;
    }
    private int getDerevo() {
        return derevo;
    }

    @Override
    public String print() {
        System.out.println(derevo);
        return super.print() + "\nderevo = " + getDerevo() + "\n_________";
    }


}
