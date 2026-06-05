package com.example.proyecto2805;

public class App {
    public static void main(String[] args) {
        String original = "Hola";
        String invertida = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }
        System.out.println("Original: " + original + " | Invertida: " + invertida);
    }
}
  
    