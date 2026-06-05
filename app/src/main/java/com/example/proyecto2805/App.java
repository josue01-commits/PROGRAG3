package com.example.proyecto2805;

public class App {
    public static void main(String[] args) {
        int[] numeros = {5, 12, 3, 21, 8};
        int mayor = numeros[0];
        for (int num : numeros) {
            if (num > mayor) {
                mayor = num;
            }
        }
        System.out.println("El número mayor es: " + mayor);
    }
}
  
    