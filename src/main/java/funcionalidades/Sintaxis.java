package funcionalidades;

import com.sofka.Operacion;

public class Sintaxis {
    public double probarSintaxis() {
        //Operacion operacion = (double x, double y) -> {return (x + y) / 2;};
        /*
        Operacion operacion = (double x, double y) -> {
            double a = 2.0;
            System.out.println(a);
            return (x + y)/2 + a;
        };
         */

        Operacion operacion = (x, y) -> (x + y) / 2; // Sin definicion de tipos
        return operacion.calcularPromedio(2, 3);
    }

    public static void main(String[] args) {
        Sintaxis app = new Sintaxis();

        System.out.println(app.probarSintaxis());
    }
}
