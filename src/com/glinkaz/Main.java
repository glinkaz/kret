package com.glinkaz;

import com.glinkaz.enviroment.Enviroment;
import com.glinkaz.kret.Gatunek;

public class Main {

    public static void main(String[] args) {
//        Enviroment en = new Enviroment();
        Enviroment enviroment = new Enviroment(20, 30, 90, 124);
        System.out.println(enviroment.toString());
        new Enviroment(20, 30, 65, 140, Gatunek.EUROPEA);
//    enviroment1.runMole();
    }
}