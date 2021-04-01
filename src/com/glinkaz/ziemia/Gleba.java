package com.glinkaz.ziemia;

public class Gleba extends ObiektyZiemne{
    private double Gestosc = Math.random()+1.4;

    public Gleba(int wartoscOdzywcza) {
        super(wartoscOdzywcza);
        symbol = Symbol.GLEBA.getSymbol();

    }
}
