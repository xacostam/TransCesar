/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transcesar.view;

import java.util.Scanner;
import transcesar.service.VehiculoService;

public class MenuVehiculos {

    private Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        while (true) {
            System.out.println("=== Menú de Vehículos ===");
            System.out.println("1. Registrar Vehículo");
            System.out.println("2. Listar Vehículos");
            System.out.println("3. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    registrarVehiculo();
                    break;
                case 2:
                    listarVehiculos();
                    break;
                case 3:
                    return; // Volver al Menú Principal
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }

    private void registrarVehiculo() {
       Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese la placa del vehículo: ");
    String placa = scanner.nextLine();

    System.out.print("Ingrese la ruta del vehículo: ");
    String ruta = scanner.nextLine();

    System.out.print("Ingrese el estado del vehículo: ");
    String estado = scanner.nextLine();

    System.out.print("Ingrese la capacidad del vehículo: ");
    int capacidad = scanner.nextInt();
    scanner.nextLine(); 

    
    VehiculoService vehiculoService = new VehiculoService();

   
    vehiculoService.registrarAuto("vehiculos.txt", placa, ruta, estado, capacidad);

    System.out.println("Vehículo registrado correctamente.");
    }

    private void listarVehiculos() {
   
    String archivo = "vehiculos.txt";

    
    VehiculoService vehiculoService = new VehiculoService();

    
    vehiculoService.listarAuto(archivo);
}
}
