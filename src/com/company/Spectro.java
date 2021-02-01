package com.company;

public class Spectro extends Person implements Printable{
    private int dark;

    public Spectro(int chakry,int dark){
        super(chakry);
        this.dark = dark;
    }

    public int getDark(){
        return dark;
    }

    @Override
    public String print() {
        return super.print() + "\ndark = " + getDark() + "\n_________";
    }
}
