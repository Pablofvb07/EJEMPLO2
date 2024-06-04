package Pkprincipañ;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmpresaTransporte empresa = new EmpresaTransporte();

        // Agregar camiones
        empresa.agregarCamion(new Camion("123ABC", 5000, 0.2));
        empresa.agregarCamion(new Camion("456DEF", 7000, 0.15));
        empresa.agregarCamion(new Camion("789GHI", 10000, 0.18));
        empresa.agregarCamion(new Camion("012JKL", 8000, 0.25));

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Cargar camión");
            System.out.println("2. Descargar camión");
            System.out.println("3. Determinar mejor camión para una carga específica");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la matrícula del camión:");
                    String matriculaCarga = scanner.nextLine();
                    System.out.println("Ingrese la carga a cargar:");
                    double carga = scanner.nextDouble();
                    empresa.cargarCamion(matriculaCarga, carga);
                    break;
                case 2:
                    System.out.println("Ingrese la matrícula del camión:");
                    String matriculaDescarga = scanner.nextLine();
                    empresa.descargarCamion(matriculaDescarga);
                    break;
                case 3:
                    System.out.println("Ingrese la carga a transportar:");
                    double cargaTransporte = scanner.nextDouble();
                    System.out.println(empresa.mejorCamionParaCarga(cargaTransporte));
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}
