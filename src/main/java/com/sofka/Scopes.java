package com.sofka;

public class Scopes {

    private static double atributo1;
    private double atributo2;

    public double probarLocalVariable() {

        final double n3 = 3; // final sirve para definir variables locales
        Operacion operacion = (x,y) -> {
            return x + y + n3;
        };
        return operacion.calcularPromedio(1,1);
    }

    public double probarAtributosStaticVariables() {
        Operacion operacion = (x, y) -> {
            atributo1 = x + y; // eñ valor se modifica
            return atributo1;
        };
        return operacion.calcularPromedio(3,2);
    }

    public static void main(String[] args) {
        Scopes app = new Scopes();
        System.out.println(app.probarLocalVariable());
    }
}
