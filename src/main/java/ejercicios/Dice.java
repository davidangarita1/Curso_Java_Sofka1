package ejercicios;

public class Dice {
    public static void main(String[] args) {
        int sides = 6;
        String result = "";
        double start = Math.floor((Math.random() * sides) + 1);
        result = String.valueOf(start);

        System.out.println(result);
    }
}
