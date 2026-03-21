/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transcesar.view;



import java.util.Scanner;

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
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    venderTicket();
                    break;
                case 2:
                    listarTickets();
                    break;
                case 3:
                    return; // Volver al Menú Principal
