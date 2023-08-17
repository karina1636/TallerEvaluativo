package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);

        System.out.println("\u001B[33m ....BIENVENIDO...  \u001B[0m");

        Integer opcion = 0;

        while (opcion != 3) {
            System.out.println("\u001B[36m Digita una opcion \u001B[0m");

            System.out.println("\u001B[33m 1.  Calcular Salario  \u001B[0m");
            System.out.println("\u001B[34m 2.  Calcular nomina  \u001B[0m");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = teclado.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    calcularSalario(teclado);
                    break;
                case 2:
                    pagarNomina(teclado);
                    break;
                case 3:
                    System.out.println("\u001B[32m Gracias por utilizar el sistema \u001B[0m");
                    break;
                default:
                    System.out.println("\u001B[31m Opcion invalida \u001B[0m");
                    break;
            }

            System.out.println();
        }

        teclado.nextInt();
    }

    private static void calcularSalario(Scanner scanner) {
        System.out.print("\u001B[31m Ingrese el número de horas trabajadas:  \u001B[0m");
        int horasTrabajadas = scanner.nextInt();
        System.out.print("\u001B[32m Ingrese la tarifa por hora:  \u001B[0m");
        double tarifaPorHora = scanner.nextDouble();

        double salario = horasTrabajadas * tarifaPorHora;
        System.out.println("El salario del empleado es: $" + salario);
    }

    private static void pagarNomina(Scanner scanner) {
        System.out.print("Ingrese el nombre del empleado: ");
        String nombreEmpleado = scanner.next();
        System.out.print("Ingrese el salario a pagar: ");
        double salarioAPagar = scanner.nextDouble();

        double deduccionSeguridadSocial = salarioAPagar * 0.08;
        double salarioFinal = salarioAPagar - deduccionSeguridadSocial;

        System.out.println("Se ha realizado el pago de nómina a " + nombreEmpleado + " por un valor de $" + salarioFinal + " se le ha rebajado el 8% por seguridad social" );
    }
}





