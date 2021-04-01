package com.glinkaz.enviroment;

import com.glinkaz.kret.Gatunek;
import com.glinkaz.kret.Kret;
import com.glinkaz.kret.MoleMotion;
import com.glinkaz.ziemia.Dzdzownica;
import com.glinkaz.ziemia.Gleba;
import com.glinkaz.ziemia.Larwa;
import com.glinkaz.ziemia.ObiektyZiemne;

import java.util.Random;

public class Enviroment {
    private final int wartoscOdzywczaDzdzownic = 3;
    private final int wartoscOdzywczaGleby = 0;
    private int n;
    private int m;
    private MoleMotion kret;

    private final ObiektyZiemne[][] enviroment;

    public Enviroment(int nVal, int mVal, int iloscLarw, int iloscDzdzownic) {
        this.n = nVal;
        this.m = mVal;
        enviroment  = new ObiektyZiemne[nVal][mVal];
        rozmiescObiektyZiemne(iloscLarw, iloscDzdzownic);
    }

    public Enviroment(int nVal, int mVal, int iloscLarw, int iloscDzdzownic, Gatunek gatunek) {
        this.kret = new Kret(gatunek);
        this.n = nVal;
        this.m = mVal;
        enviroment  = new ObiektyZiemne[nVal][mVal];
        rozmiescObiektyZiemne(iloscLarw, iloscDzdzownic);
        runMole();
    }

    public void runMole(){
        for (int i = 0; i < 10; i++) {
            kret.goMole(enviroment);
        }
        System.out.println(toString());
    }

    public void rozmiescObiektyZiemne(int iloscLarw, int iloscDzdzownic) {
        for (int i = 0; i < iloscLarw; i++) {
            int[] wspolrzedne = losowanieWspolrzednych();
            int x = wspolrzedne[0];
            int y = wspolrzedne[1];
            Larwa larwa = new Larwa(losowanieWartosciOdzywczej());
            enviroment[x][y] = larwa;
        }

        for (int i = 0; i < iloscDzdzownic; i++) {
            int[] wspolrzedne = losowanieWspolrzednych();
            int x = wspolrzedne[0];
            int y = wspolrzedne[1];
            Dzdzownica dzdzownica = new Dzdzownica(wartoscOdzywczaDzdzownic);
            enviroment[x][y] = dzdzownica;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(enviroment[i][j] == null){
                    enviroment[i][j] = new Gleba(wartoscOdzywczaGleby);
                }
            }
        }


    }

    private int losowanieWartosciOdzywczej(){
        Random random = new Random();
        return random.nextInt(3)+3;
    }

    public int[] losowanieWspolrzednych(){
        Random random = new Random();
        int x, y;
        do{
            x = random.nextInt(n);
            y = random.nextInt(m);
        }while(enviroment[x][y] != null);
        return new int [] {x, y};
    }

    @Override
    public String toString() {
        StringBuilder wypisz = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(enviroment[i][j] == null){
                    wypisz.append("  ");
                }else{
                    wypisz.append(enviroment[i][j].getSymbol());
                }
            }
            wypisz.append("\n");

        }
        return wypisz.toString();
    }

    public ObiektyZiemne[][] getEnviroment() {
        return enviroment;
    }
}
