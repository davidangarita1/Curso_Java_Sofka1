package com.sofka;

public interface PersonaB {
    default public void hablar() {
        System.out.println("Saludos amig@ - Persona B"); //
    }
}
