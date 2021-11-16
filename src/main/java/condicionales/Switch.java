package condicionales;

public class Switch {
    public static void main(String[] args) {
        // int y char

        char x;
        x = 'a';
        switch(x)
        {
            case 'a':
                System.out.println("Esta es la opción "+x);
                break;
            case 'b':
                System.out.println("Esta es la opción "+x);
                break;
            case 'c':
                System.out.println("Esta es la opción "+x);
                break;
            case 'd':
                System.out.println("Esta es la opción "+x);
                break;
            default:
                System.out.println("Elegiste una opcion incorrecta");
                break;
        }
    }
}
