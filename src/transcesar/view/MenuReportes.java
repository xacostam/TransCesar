/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transcesar.view;



import java.util.Scanner;

public class MenuReportes {

    private Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        while (true) {
            System.out.println("=== Menú de Reportes ===");
            System.out.println("1. Consultar Tickets por Fecha");
            System.out.println("2. Consultar Tickets por Tipo de Vehículo");
            System.out.println("3. Consultar Tickets por Tipo de Pasajero");
            System.out.println("4. Resumen del Día Actual");
            System.out.println("5. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    consultarTicketsPorFecha();
                    break;
                case 2:
                    consultarTicketsPorVehiculo();
                    break;
                case 3:
                    consultarTicketsPorPasajero();
                    break;
                case 4:
                    mostrarResumenDelDia();
                    break;
                case 5:
                    return; // Volver al Menú Principal
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }

    private void consultarTicketsPorFecha() {
        
    }

    private void consultarTicketsPorVehiculo() {
        
    }

    private void consultarTicketsPorPasajero() {
        
    }

    private void mostrarResumenDelDia() {
      
    }
}
