package com.company;

public class Den extends Person implements Printable{
    private int drago;

    public Den(int chakry,int drago){
        super(chakry);
        this.drago = drago;
    }

    public int getDrago(){
        return drago;
    }

    @Override
    public String print() {
        return super.print() + "\ndrago = " + getDrago() + "\n_________";
    }
}
