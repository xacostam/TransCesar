/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transcesar.view;

import java.util.Scanner;

public class MenuConductores {

    private Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        while (true) {
            System.out.println("=== Menú de Conductores ===");
            System.out.println("1. Registrar Conductor");
            System.out.println("2. Listar Conductores");
            System.out.println("3. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    registrarConductor();
                    break;
                case 2:
                    listarConductores();
                    break;
                case 3:
                    return; // Volver al Menú Principal
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }

    private void registrarConductor() {
        System.out.println("=== Registrar Conductor ===");
        // Aquí iría la lógica para registrar un conductor
        System.out.println("Funcionalidad no implementada.");
    }

    private void listarConductores() {
        System.out.println("=== Listar Conductores ===");
        // Aquí iría la lógica para listar los conductores
        System.out.println("Funcionalidad no implementada.");
    }
}
