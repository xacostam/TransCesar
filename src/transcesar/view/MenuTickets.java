/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transcesar.view;



import java.util.Scanner;
import transcesar.model.Ticket;
import transcesar.service.TicketService;


    public class MenuTickets {

    private Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        while (true) {
            System.out.println("=== Menú de Tickets ===");
            System.out.println("1. Vender Ticket");
            System.out.println("2. Listar Tickets");
            System.out.println("3. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); 
            switch (opcion) {
                case 1:
                    venderTicket();
                    break;
                case 2:
                    listarTickets();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }

    private void venderTicket() {
        TicketService service = new TicketService();

        System.out.print("ID: ");
        String id = scanner.nextLine();

        System.out.print("Documento: ");
        String documento = scanner.nextLine();

        System.out.print("Placa: ");
        String placa = scanner.nextLine();

        System.out.print("Origen: ");
        String origen = scanner.nextLine();

        System.out.print("Destino: ");
        String destino = scanner.nextLine();


        service.venderTicket(id, documento, placa, origen, destino);


        service.verDetalleTicket(id);
    }

    private void listarTickets() {
        TicketService service = new TicketService();
        System.out.println("=== Listar Tickets ===");
        service.listarTickets();
        
    }
}