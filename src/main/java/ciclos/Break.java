package ciclos;

public class Break {
    public static void main(String[] args) {
        // break; // Salirse de un ciclo
        // continue; // Contituar un ciclo

        for(int i = 0; i <= 10; i++){
            System.out.println("Aun estas en el ciclo");
            if(i == 4) {
                //break;
                continue;
            }

            System.out.println("El valor de i es: "+i);
        }
        System.out.println("Has dejado el ciclo for");
    }
}
