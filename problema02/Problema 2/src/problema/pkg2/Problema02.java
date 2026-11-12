/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema.pkg2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema02 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            scanner.useLocale(Locale.US);
            
            System.out.println("=== Sistema de peaje nueva via ===");
            
            // 1. Solicitar datos de entrada
            System.out.print("Ingrese nombre del propietario: ");
            String propietario = scanner.nextLine();
            
            System.out.println("\nClasificación de vehículos:");
            System.out.println("1. Vehículo liviano particular");
            System.out.println("2. Vehículo grande particular");
            System.out.println("3. Taxi");
            System.out.println("4. Bus urbano");
            System.out.print("Seleccione el tipo (1-4): ");
            int tipoVehiculo = scanner.nextInt();
            
            // Validar que el tipo de vehículo sea válido antes de continuar
            if (tipoVehiculo >= 1 && tipoVehiculo <= 4) {
                System.out.print("Ingrese el avalúo del vehículo ($): ");
                double avaluo = scanner.nextDouble();
                
                String descripcionTipo = "";
                double porcentajeAvaluo = 0;
                double valorFijo = 0;
                double recargo = 0.0;
                
                // 2. Determinar tarifas y descripción según el tipo de vehículo usando switch
                switch (tipoVehiculo) {
                    case 1 -> {
                        descripcionTipo = "Vehículo liviano particular";
                        porcentajeAvaluo = 0.0001; // 0.01 %
                        valorFijo = 2.00;
                    }
                    case 2 -> {
                        descripcionTipo = "Vehículo grande particular";
                        porcentajeAvaluo = 0.0002; // 0.02 %
                        valorFijo = 2.50;
                    }
                    case 3 -> {
                        descripcionTipo = "Taxi";
                        porcentajeAvaluo = 0.0004; // 0.04 %
                        valorFijo = 1.50;
                    }
                    case 4 -> {
                        descripcionTipo = "Bus urbano";
                        porcentajeAvaluo = 0.0005; // 0.05 %
                        valorFijo = 2.20;
                    }
                }
                
                // 3. Cálculo del valor base del peaje
                double valorBasePeaje = (avaluo * porcentajeAvaluo) + valorFijo;
                
                // 4. Aplicar recargo si corresponde (Vehículos tipo 1 y 2 con avalúo superior a $30,000)
                if ((tipoVehiculo == 1 || tipoVehiculo == 2) && avaluo > 30000.0) {
                    recargo = 1.50;
                }
                
                // 5. Cálculo del total a cancelar
                double totalCancelar = valorBasePeaje + recargo;
                
                // 6. Presentar el reporte formateado con dos decimales
                System.out.println("\nPeaje \"Buena Vía\"");
                System.out.println("Propietario: " + propietario);
                System.out.println("Tipo: " + descripcionTipo);
                System.out.printf("    Avalúo: $%.2f%n", avaluo);
                System.out.printf("    Valor base del peaje: $%.2f%n", valorBasePeaje);
                
                // Mostrar el recargo únicamente si aplica 
                System.out.printf("    Recargo: $%.2f%n", recargo);
                System.out.println();
                System.out.printf("    Total a cancelar: $%.2f%n", totalCancelar);
                
            } else {
                System.out.println("\nError: El tipo de vehículo ingresado no es válido.");
            }
        }
    }
}