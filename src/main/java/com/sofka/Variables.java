package com.sofka;

public class Variables {
    /**
     * short - numeros cortos
     * int - numeros enteros
     * long - numeros enteros largos
     * float - numeros flotantes
     * double - nuemros dobles
     * byte - se maneja bytes
     * char - caracteres
     * boolean - boleanos, verdaderos o falsos
     * String - cadenas de texto
     *  + - * / %
     */
    public static void main(String[] args) {
        short suma;
        suma = 3 + 10;
        int resta = 8 - 17;
        long residuo = 9/2;
        float multiplicacion = 2 * (15*(-2));
        double division = 10/3.4;

        System.out.println("El resultado de la suma es: "+suma); // suma
        System.out.println("El resultado de la resta es: "+resta); // resta
        System.out.println("El resultado de la multiplicación es: "+multiplicacion); // multiplicacion
        System.out.println("El resultado de la división es: "+division); // division
        System.out.println("El resultado de la división es: "+residuo); // modulo o residuo
    }
}
