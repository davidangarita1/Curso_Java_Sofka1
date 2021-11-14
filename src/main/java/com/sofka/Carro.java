package com.sofka;

public class Carro {
    // Variables nativas de la clase
    double peso;
    double altura;
    double ancho;
    double largo;
    int numeroPuertas;
    boolean encendido=false;
    String modelo;

    //constructores
    public Carro() {
        this.peso = 1000;
        this.altura = 1.90;
        this.ancho = 4;
        this.largo = 5;
        this.numeroPuertas = 4;
    }

    // Metodos
    public double obtenerPeso() {
        return this.peso;
    }

    public void encender() {
        this.encendido = true;
        System.out.println("Haz encendido el carro");
    }

    public void apagar() {
        this.encendido = false;
        System.out.println("Haz apagado el carro");
    }

    public void estado() {
        if (encendido == true) {
            System.out.println("El carro esta encendido");
        } else {
            System.out.println("El carro esta apagado");
        }
    }

    // Polimorfismo: metodos con el mismo nombre pueden hacer diferentes cosas
    public void informacion () {
        System.out.println("Este es un carro comun y corriente");
    }
}

// Herencia
class CarroBMW extends Carro {
    // Hereda todos los metodos y propiedades de Carro
    public CarroBMW () {
        this.modelo="BMW";
    }
    public void turbo () {
        System.out.println("Acabas de viajar a 100 millas por hora!");
    }
    // funcion polimorfa
    public  void informacion () {
        System.out.println("Este es un BMW del año 2011");
    }
}

class CarroToyota extends Carro {
    public CarroToyota () {
        modelo = "Toyota";
    }
    public String modelo () {
        return this.modelo;
    }
    // funcion polimorfa
    public void informacion () {
        System.out.println("Este es un Toyota del año 2010");
    }
}