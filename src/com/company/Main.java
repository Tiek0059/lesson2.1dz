package com.company;

public class Main {

    public static void main(String[] args) {
        Person den = createObject("drago");
        System.out.println(den.print());
        Person marucho = createObject("derevo");
        System.out.println(marucho.print());
        Person spectro = createObject("dark");
        System.out.println(spectro.print());
    }


    public static Person createObject(String className) {
        switch (className) {
            case "drago":
                return new Den(2, 98);
            case "derevo":
                return new Marucho(3, 37);
            case "dark":
                return new Spectro(4, 34);
            default:
                return null;
        }
    }
}
