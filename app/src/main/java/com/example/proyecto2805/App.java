package com.example.proyecto2805;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double totalVendido = 0.0;
            int cantidadVentas = 0;
            double venta;
            
            System.out.println("--- Registro de Ventas Diarias ---");
            System.out.println("Ingrese el monto de la venta (Ingrese 0 para finalizar):");
            
            do {
                System.out.print("Venta: $");
                venta = scanner.nextDouble();
                
                // Solo procesamos ventas válidas mayores a 0
                if (venta > 0) {
                    totalVendido += venta;
                    cantidadVentas++;
                } else if (venta < 0) {
                    System.out.println("Monto inválido. Ingrese un valor positivo.");
                }
                
            } while (venta != 0); // El bucle se repite mientras la venta no sea 0
            
            System.out.println("\n---------------------------");
            System.out.println("Cantidad de ventas registradas: " + cantidadVentas);
            System.out.println("Total vendido: $" + totalVendido);
        }
           
        }
    }
    