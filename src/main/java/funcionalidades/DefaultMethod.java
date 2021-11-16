package funcionalidades;

import com.sofka.PersonaA;
import com.sofka.PersonaB;

public class DefaultMethod implements PersonaA, PersonaB {

    @Override
    public void caminar() {
        System.out.println("Estoy caminando.");
    }

    @Override
    public void hablar() {
        PersonaA.super.hablar();
    }

    public static void main(String[] args) {
        DefaultMethod app = new DefaultMethod();
        app.hablar();
    }


}
