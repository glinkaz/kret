package com.glinkaz.kret;

public enum Gatunek {
    CINEREA("cinerea"),
    EUROPEA("europea"),
    VELESSIENSIS("velessiensis");

    private final String gatunek;
    Gatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public String getGatunek() {
        return gatunek;
    }
}
