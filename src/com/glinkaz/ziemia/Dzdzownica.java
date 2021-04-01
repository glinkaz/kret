package com.glinkaz.ziemia;


public class Dzdzownica extends ObiektyZiemne{
    private double masa = (Math.random()+1)/2;
    public Dzdzownica(int wartoscOdzywcza) {
        super(wartoscOdzywcza);
        symbol = Symbol.DZDZOWNICA.getSymbol();
    }
}
