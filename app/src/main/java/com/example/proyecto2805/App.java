package com.example.proyecto2805;

public class App {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        double suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        double promedio = suma / numeros.length;
        System.out.println("El promedio es: " + promedio);
    }
}
  
    