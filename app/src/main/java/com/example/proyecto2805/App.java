package com.example.proyecto2805;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
try (Scanner scanner = new Scanner(System.in)) {
            double totalVendido = 0;
            int cantidadVentas = 0;
            double ventaActual;
            
            System.out.println("--- Registro de Ventas Diarias ---");
            System.out.println("Ingrese las ventas una por una. Escriba 0 para finalizar el día.\n");
            
            do {
                System.out.print("Ingrese el monto de la venta: $");
                ventaActual = scanner.nextDouble();
                
                if (ventaActual > 0) {
                    totalVendido = totalVendido + ventaActual;
                    cantidadVentas++;
                } else if (ventaActual < 0) {
                    System.out.println("Error: No se pueden ingresar ventas negativas.");
                }
                
            } while (ventaActual != 0);
            
            System.out.println("\n=== Resumen del Día ===");
            System.out.println("Cantidad total de ventas registradas: " + cantidadVentas);
            System.out.println("Monto total vendido: $" + totalVendido);
        }
    }
}