package com.example.proyecto2805;

public class App {
    public static void main(String[] args) {
        int year = 2024;
        boolean esBisiesto = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (esBisiesto) {
            System.out.println(year + " es un año bisiesto.");
        } else {
            System.out.println(year + " no es bisiesto.");
        }
    }
}
  
    