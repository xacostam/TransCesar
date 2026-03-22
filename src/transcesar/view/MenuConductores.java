/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transcesar.view;

import java.util.List;
import java.util.Scanner;
import transcesar.dao.PersonaDao;

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
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    registrarConductor();
                    break;
                case 2:
                    listarConductores();
                    break;
                case 3:
                    return; 
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }

    private void registrarConductor() {
         Scanner sc = new Scanner(System.in);

    System.out.println("=== Registrar Conductor ===");

    System.out.print("Documento: ");
    String documento = sc.nextLine();

    System.out.print("Nombre: ");
    String nombre = sc.nextLine();

    System.out.print("Numero de Licencia: ");
    String licencia = sc.nextLine();

    System.out.print("Categoria de licencia");
    String cate_licencia = sc.nextLine();

    
    String datos = documento + ";" + nombre + ";" + licencia + ";" + cate_licencia;

    
    PersonaDao dao = new PersonaDao();
    dao.registrarConductor(datos);

    System.out.println("Conductor registrado correctamente");
    }

    private void listarConductores() {
        System.out.println("=== LISTA DE CONDUCTORES ===");

    PersonaDao dao = new PersonaDao();
    List<String> lista = dao.listarConductor();

    if (lista.isEmpty()) {
        System.out.println("No hay conductores registrados");
        return;
    }

    for (String linea : lista) {

        String[] c = linea.split(";");

        System.out.println("----------------------------");
        System.out.println("Documento: " + c[0]);
        System.out.println("Nombre: " + c[1]);
        System.out.println("Numero de Licencia:: " + c[2]);
        System.out.println("Categoria de licencia:: " + c[3]);
    }

    System.out.println("----------------------------");
        
    }
}
