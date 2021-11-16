package com.sofka;
import java.io.*;
import java.util.Locale;

public class VariablesDeTexto {
    /**
     * @param args
     * leer desde el teclado
     * concat()
     * toUpperCase()
     * toLowerCase()
     * lenght()
     * Convertir variables numericas a Strings y viceversa
     */
    public static void main(String[] args) {
        String texto = "";
        double x = 0;

        texto = String.valueOf(x);

        /*
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);

        try {
            texto = buffer.readLine();
            x = Double.parseDouble(texto);

            // x = Integer.parseInt(texto); // Covnertir string a numero
        } catch (Exception e) {
            System.out.println("Debes Escribir un numero");
        }
        */

        // texto = texto.concat(" - Esto Es Una concatenacion"); // Concatenar Texto
        // texto = texto.toLowerCase(); // Convertir a minusculas
        // texto = texto.toUpperCase(); // Concertir a mayusculas
        // int a = texto.length(); // Conocer la longitud de caracteres

        System.out.println(texto);
    }
}
