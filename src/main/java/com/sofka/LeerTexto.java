package com.sofka;
// Libreria necesaria para leer archivos
import java.io.*;

public class LeerTexto {

    public void leer (String nombreArchivo) {
        try {
            // Creacion de variable de clase FileReader
            FileReader r = new FileReader(nombreArchivo);
            BufferedReader buffer = new BufferedReader(r);

            String temp = "";

            while(temp!=null) {
                temp = buffer.readLine(); // Lee linea
                if(temp==null)
                    break;
                System.out.println(temp);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
