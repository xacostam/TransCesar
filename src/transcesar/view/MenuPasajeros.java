/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transcesar.view;

import java.util.List;
import java.util.Scanner;
import transcesar.dao.PersonaDao;

public class MenuPasajeros {

    private Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        while (true) {
            System.out.println("=== Menú de Pasajeros ===");
            System.out.println("1. Registrar Pasajero");
            System.out.println("2. Listar Pasajeros");
            System.out.println("3. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    registrarPasajero();
                    break;
                case 2:
                    listarPasajeros();
                    break;
                case 3:
                    return; 
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }

    private void registrarPasajero() {
        Scanner sc = new Scanner(System.in);

    System.out.println("=== Registrar Pasajero ===");

    System.out.print("Cedula: ");
    String documento = sc.nextLine();

    System.out.print("Nombre: ");
    String nombre = sc.nextLine();

    System.out.print("Tipo Pasajero");
    String tipopasajero = sc.nextLine();

    
    String datos = documento + ";" + nombre + ";"  + tipopasajero;

    
    PersonaDao dao = new PersonaDao();
    dao.registrarPasajero(datos);

    System.out.println("Conductor registrado correctamente");
    }

    private void listarPasajeros() {
        System.out.println("=== LISTA DE CONDUCTORES ===");

    PersonaDao dao = new PersonaDao();
    List<String> lista = dao.listarPasajeros();

    if (lista.isEmpty()) {
        System.out.println("No hay Pasajeros registrados");
        return;
    }

    for (String linea : lista) {

        String[] c = linea.split(";");

        System.out.println("----------------------------");
        System.out.println("Cedula: " + c[0]);
        System.out.println("Nombre: " + c[1]);
        System.out.println("Tipo de pasajero " + c[2]);
       
    }

    System.out.println("----------------------------");
    }
}
