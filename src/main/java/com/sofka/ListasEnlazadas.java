package com.sofka;

import java.util.LinkedList;

public class ListasEnlazadas {
    public static void main(String[] args) {

        LinkedList lista = new LinkedList();

        lista.add("Palabra"); // .add nos permite añadir elementos a la lista
        lista.add(5);
        lista.add(1, 17);
        lista.addLast("Estoy de ultimo");

        lista.remove(0); // .remove(indice) elimina un elemento en un indice determinado

        System.out.println("El tamaño de la lista es: "+lista.size()); // .sise() muestra el tamaño de la lista
        System.out.println(lista.get(1)); // .get(indice) obtiene un elemento en un indice determinado
        System.out.println(lista.getFirst()); // .getFirst() obtiene el primer elemento de la lista
        System.out.println(lista.getLast()); // .getFirst() obtiene el ultimo elemento de la lista

    }
}
