/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transcesar.view;

import transcesar.service.PersonaService;
import transcesar.service.TicketService;
import transcesar.service.VehiculoService;
import transcesar.util.RutaArchivos;
import java.util.Scanner;
public class MenuPrincipal {
    
    private  TicketService   ticketService;
    private  PersonaService  personaService;
    private  VehiculoService vehiculoService;
    private  Scanner         sc = new Scanner(System.in);

    
    
     public MenuPrincipal(TicketService ts, PersonaService ps, VehiculoService vs) {
        this.ticketService   = ts;
        this.personaService  = ps;
        this.vehiculoService = vs;
    }
     
     public void iniciar() {
        banner();
        boolean salir = false;
        while (!salir) {
            System.out.println("MENU PRINCIPAL");
            System.out.println("   1. Gestion de Tickets");
            System.out.println("   2. Gestion de Pasajeros y Conductores");
            System.out.println("   3. Gestion de Vehiculos");
            System.out.println("   4. Reportes");
            System.out.println("   0. Salir del sistema");
           
            int op = leerEntero("  Opcion: ");
            switch (op) {
                case 1 -> new MenuTickets(ticketService, personaService, sc).mostrar();
                case 2 -> new MenuPasajeros(personaService, sc).mostrar();
                case 3 -> new MenuVehiculos(vehiculoService, personaService, sc).mostrar();
                case 4 -> new MenuReportes(ticketService, personaService, vehiculoService, sc).mostrar();
                case 0 -> salir = true;
                default -> System.out.println("\n  [!] Opcion no valida.");
            }
        }
        despedida();
    }

    private void banner() {
        System.out.println("\n" );
        System.out.println("TRANSCESAR S.A.S.");
        System.out.println("Sistema de Gestion de Tickets");
        System.out.println("Transporte Intermunicipal - Cesar");
        
    }

    private void despedida() {
        System.out.println("\n");
        System.out.println("Gracias por usar TransCesar S.A.S.");
        System.out.println("\n");
    }

    private int leerEntero(String p) {
        while (true) {
            System.out.print(p);
            try { return Integer.parseInt(sc.nextLine().trim()); }
            catch (NumberFormatException e) { System.out.println("\n  [!] Ingrese un numero valido."); }
        }
    }
    
}
