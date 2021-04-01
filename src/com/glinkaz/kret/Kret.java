package com.glinkaz.kret;

import com.glinkaz.ziemia.ObiektyZiemne;

import java.util.Random;

public class Kret implements MoleMotion {
    private final Gatunek gatunek;
    Random random = new Random();
    private int wartoscOdzywcza = random.nextInt(40) + 200;

    public Kret(Gatunek gatunek) {
        this.gatunek = gatunek;
    }

    @Override
    public void goMole(ObiektyZiemne[][] enviroment) {
        int x = random.nextInt(enviroment.length);
        int y = random.nextInt(enviroment[0].length);
        if (enviroment[x][y] != null) {
            int wartoscOdzywczaJedzenia = enviroment[x][y].getWartoscOdzywcza();
            wartoscOdzywcza += wartoscOdzywczaJedzenia;
            System.out.println("Mniam, wartosc odzywcza jedzenia: " + wartoscOdzywczaJedzenia + " wspolrzedne: (" + x +
                    ", " + y + ")");
            System.out.println(x + y);
            enviroment[x][y] = null;
        } else {
            System.out.println("Pusto :(");
        }
    }

    @Override
    public String getNutritionValue() {
        return "" + wartoscOdzywcza;
    }
}
