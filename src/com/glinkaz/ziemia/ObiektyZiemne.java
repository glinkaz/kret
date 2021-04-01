package com.glinkaz.ziemia;

public abstract class ObiektyZiemne {


    protected String symbol;
    protected int wartoscOdzywcza;
    public ObiektyZiemne(int wartoscOdzywcza){
        this.wartoscOdzywcza = wartoscOdzywcza;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getWartoscOdzywcza() {
        return wartoscOdzywcza;
    }
}
