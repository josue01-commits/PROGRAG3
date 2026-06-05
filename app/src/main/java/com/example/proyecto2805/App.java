package com.example.proyecto2805;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double totalVendido = 0;
            int cantidadVentas = 0;
            double ventaActual;
            final int LIMITE_MAXIMO = 5;
            double ventaMayor = 0;
            double ventaMenor = Double.MAX_VALUE;
            int ventasGrandes = 0;
            String nombreCajero = "cajero de turno  "; 

            System.out.println("--- Registro de Ventas Diarias(Maximo " + LIMITE_MAXIMO + " ventas)---");
            System.out.println("cajero encargado : " + nombreCajero);
            System.out.println("Ingrese las ventas una por una. Escriba 0 para finalizar el dia.\n");
            
            do {
                System.out.print("Ingrese el monto de la venta: $");
                ventaActual = scanner.nextDouble();

                if (ventaActual > 0) {
                    totalVendido = totalVendido + ventaActual;
                    cantidadVentas++;
                if (ventaActual > ventaMayor){
                    ventaMayor = ventaActual;
                }
                if (ventaActual < ventaMenor) {
                   ventaMenor = ventaActual;
                }
                if (ventaActual > 50){
                    ventasGrandes++;
                }
                
                } else if (ventaActual < 0) {
                    System.out.println("Error: No se pueden ingresar ventas negativas.");
                }

            } while (ventaActual != 0 && cantidadVentas < LIMITE_MAXIMO );
            if (cantidadVentas == LIMITE_MAXIMO) {
             System.out.println("\n[AVISO: Se alcanzo el limite maximo de transacciones para este turno]");
}
            if (ventaActual == 0 && cantidadVentas < LIMITE_MAXIMO){
                System.out.println("\n[AVISO: el turno fue cerrado manualmente por el usuario]");
                     
            }
        
            System.out.println("\n=== Resumen del Dia ===");
            System.out.println("Cantidad total de ventas registradas: " + cantidadVentas);
            System.out.println("Monto total vendido: $" + totalVendido);
            
            if (cantidadVentas >0) {
                double promedio = totalVendido / cantidadVentas;
                System.out.println("promedio por venta: $%.2f\n "+promedio);
                System.out.println("la mayor venta registrada de hoy fue : $ "+ ventaMayor);
            }
            if (cantidadVentas > 0) {
            System.out.println("La menor venta registrada hoy fue de: $" + ventaMenor);
                System.out.println("cantidad de ventas mayores a $50: "+ ventasGrandes);
            }
            double ivaEstimado = totalVendido * 0.15;
            System.out.println("impuesto estimado recolectado ( IVA 15%%): $%.2f\n" + ivaEstimado);
            
            double totalNeto = totalVendido / 1.15;
            System.out.println("monto neto de ventas ( sin iva ): $%.2f\n" + totalNeto);
    }
}