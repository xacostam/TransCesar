/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transcesar.view;


import java.util.Scanner;

public class MenuPrincipal {

    private Scanner scanner = new Scanner(System.in);
    private MenuVehiculos menuVehiculos = new MenuVehiculos();
    private MenuPasajeros menuPasajeros = new MenuPasajeros();
    private MenuTickets menuTickets = new MenuTickets();
    private MenuReportes menuReportes = new MenuReportes();
    private MenuConductores menuConductores = new MenuConductores();

    public void mostrarMenu() {
        while (true) {
            System.out.println("=== Menú Principal ===");
            System.out.println("1. Gestionar Vehículos");
            System.out.println("2. Gestionar Pasajeros");
            System.out.println("3. Venta de Tickets");
            System.out.println("4. Reportes");
            System.out.println("5. Gestionar Conductores");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    menuVehiculos.mostrarMenu();
                    break;
                case 2:
                    menuPasajeros.mostrarMenu();
                    break;
                case 3:
                    menuTickets.mostrarMenu();
                    break;
                case 4:
                    menuReportes.mostrarMenu();
                    break;
                case 5:
                    menuConductores.mostrarMenu();
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    return; // Salir del programa
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }
}
