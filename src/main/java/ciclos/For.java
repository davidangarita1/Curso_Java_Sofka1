package ciclos;

public class For {
    public static void main(String[] args) {
        // Existen 3 partes en el ciclo for |Contador|Rango|Aumentador|

        // Incremental
        System.out.println("|---------------------|");
        for(int cont = 0; cont <= 9; cont++){
            System.out.println("| El contador vale: "+cont+" |");
        }
        System.out.println("|---------------------|");
        // Decremental
        for(int cont = 9; cont >= 0; cont--){
            System.out.println("| El contador vale: "+cont+" |");
        }
        System.out.println("|---------------------|");
    }
}
