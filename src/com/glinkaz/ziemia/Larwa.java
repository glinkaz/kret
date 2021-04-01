package com.glinkaz.ziemia;

public class Larwa extends ObiektyZiemne{
    private double masa = Math.random()+2;

    public Larwa(int wartoscOdzywcza) {
        super(wartoscOdzywcza);
        symbol = Symbol.LARWA.getSymbol();

    }


}
