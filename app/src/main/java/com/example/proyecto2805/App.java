package com.example.proyecto2805;

public class App {
    public static void main(String[] args) {
        String palabra = "programacion";
        int vocales = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.toLowerCase().charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vocales++;
            }
        }
        System.out.println("La palabra tiene " + vocales + " vocales.");
    }
}
  
    