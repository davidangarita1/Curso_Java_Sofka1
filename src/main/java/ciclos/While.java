package ciclos;

public class While {
    public static void main(String[] args) {
        // El ciclo while consta de 2 partes |contador|condicion|incrementador
        // pero a diferencia del ciclo FOR estas partes van por separado

        int x=0; // contador
        while(x<=10 ){ // condicion
            System.out.println("El valor de X es: "+x);
            x = x +2; // incrementador
        }

        // While dinamico
        int y=0;
        while(y<=15){
            System.out.println("El valor de Y es: "+y);
            y = (y*2) +3;
        }
    }
}
