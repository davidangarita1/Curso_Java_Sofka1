package com.sofka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaApp {

    public void ordenar() {
        List<String> lista = new ArrayList<>();
        lista.add("DangWebs");
        lista.add("Webs");
        lista.add("Dang");

        /* JDK 1.7
        Collections.sort(lista, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
         */

        Collections.sort(lista, (String p1, String p2) -> p1.compareTo(p2));

        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }

    public void calcular () {
       Operacion operacion = (double x, double y) -> (x+y)/2;
        System.out.println(operacion.calcularPromedio(2, 3));
    }

    public static void main(String[] args) {
        LambdaApp app = new LambdaApp();
        app.ordenar();

    }
}
