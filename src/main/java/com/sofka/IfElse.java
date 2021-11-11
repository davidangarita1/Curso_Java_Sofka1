package com.sofka;

public class IfElse {
    /**
     *
     * @param args
     * > , >= ,  < , <= , == , ||, &&, !
     */
    public static void main(String[] args) {
        double ramd = Math.floor(Math.random()*7);

        if(ramd < 3){
           //CODIGO
            System.out.println(ramd);
            System.out.println("Si se cumplio la condición");
        }
        else {
            //CODIGO
            System.out.println(ramd);
            System.out.println("No se cumplio la condición");
        }
    }
}
