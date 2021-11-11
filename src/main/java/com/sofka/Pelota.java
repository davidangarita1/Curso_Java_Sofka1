package com.sofka;

public class Pelota {

    float radio;
    float peso;
    public Pelota()
    {
        radio=100;
        peso=250;
    }

    public Pelota(float radio, float peso)
    {
        this.radio=radio;
        this.peso=peso;
    }

    public float obtenerRadio()
    {
        return radio;
    }

    public String patearPelota()
    {
        String x = "Haz Pateado la pelota";
        System.out.println(x);
        return x;
    }
}
