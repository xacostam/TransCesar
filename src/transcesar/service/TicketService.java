/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transcesar.service;

import transcesar.dao.TicketDao;
import transcesar.dao.VehiculoDao;
import transcesar.dao.PersonaDao;
import transcesar.model.Ticket;

import java.time.LocalDate;

public class TicketService {
    
    TicketDao ticketDAO = new TicketDao();
    VehiculoDao vehiculoDAO = new VehiculoDao();
    PersonaDao pasajeroDAO = new PersonaDao();
    public void venderTicket(String id, String documento, String placa,
                             String origen, String destino) {

        String vehiculo = vehiculoDAO.buscarAuto("bus.txt", placa);
        if (vehiculo == null) {
            System.out.println("Vehículo no encontrado");
            return;
        }
        String[] v = vehiculo.split(";");

        int capacidad = Integer.parseInt(v[3]);
        int ocupados = Integer.parseInt(v[4]);
        if (ocupados >= capacidad) {
            System.out.println("Vehículo lleno. No se puede vender");
            return;
        }
        String pasajero = pasajeroDAO.buscarPasajero(documento);
        if (pasajero == null) {
            System.out.println("Pasajero no encontrado");
            return;
        }
        String[] p = pasajero.split(";");

        double descuento = Double.parseDouble(p[3]);
        double tarifa = 10000; 
        double total = tarifa - (tarifa * descuento);
        
        String fecha = LocalDate.now().toString();
        Ticket t = new Ticket(id, documento, placa, fecha, origen, destino, total);
        ticketDAO.guardarTicket(t.toString());
        ocupados++;

        vehiculoDAO.cambiarEstado("bus.txt", placa, v[2]);
        System.out.println("Ticket vendido correctamente");
    }
    public void listarTickets() {

        ticketDAO.listarTickets().forEach(System.out::println);
    }
}
