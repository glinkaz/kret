package com.glinkaz.ziemia;

public enum Symbol {
    GLEBA(" #"),
    DZDZOWNICA("{}"),
    LARWA(" @");

    private final String symbol;
    Symbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
