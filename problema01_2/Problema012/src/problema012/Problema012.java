/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema012;

import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
           System.out.println("\nSeleccione una operacion:");
        System.out.println("1 Suma");
        System.out.println("2 Resta");
        System.out.println("3 Multiplicacion");
        System.out.println("4 Division");
        System.out.println("5 Modulo");
        System.out.println("6 Potencia");

        System.out.print("Ingrese unnumero: ");
        double num1 = sc.nextDouble();

        System.out.print("Ingrese un numero: ");
        double num2 = sc.nextDouble();

        System.out.print("Ingrese una opcion (1-6): ");
        int opcion = sc.nextInt();

        if (num1 > num2) {

            double resultado = 0;
            String operacion = "";

            switch (opcion){

                case 1:
                    resultado = num1 + num2;
                    operacion = "Suma";
                    break;

                case 2:
                    resultado = num1 - num2;
                    operacion = "Resta";
                    break;

                case 3:
                    resultado = num1 * num2;
                    operacion = "Multiplicacion";
                    break;

                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        operacion = "Division";
                    } else {
                        System.out.println("No se puede dividir para cero.");
                    }
                    break;

                case 5:
                    if (num2 != 0) {
                        resultado = num1 % num2;
                        operacion = "Modulo";
                        
                    }else{
                        System.out.println("No se puede calcular el modulo con cero.");
                    }
                    break;

                case 6:
                    resultado = Math.pow(num1, num2);
                    operacion = "Potencia";
                    break;

                default:
                    System.out.println("Opcion no valida.");
                    break;
            }

            if (!operacion.equals("")) {
                System.out.println("\nOPERACIONES ARITMETICAS");
                System.out.println("Primer numero: " + num1);
                System.out.println("Segundo numero: " + num2);
                System.out.println("Operacion seleccionada: " + operacion);
                System.out.println("Resultado: " + resultado);
            }

        } else {
            System.out.println("El primer numero debe ser mayor que el segundo.");
        }

        sc.close();
    }

}
