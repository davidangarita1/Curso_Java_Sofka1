package com.sofka;

public interface PersonaA {

    public void caminar();

    default public void hablar() {
        System.out.println("Saludos amig@ - Persona A"); //
    }
}
