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
    
    String fecha = java.time.LocalDate.now().toString();
    TicketDao ticketDAO = new TicketDao();
    VehiculoDao vehiculoDAO = new VehiculoDao();
    PersonaDao pasajeroDAO = new PersonaDao();
    
    public void venderTicket(String id, String documento, String placa,String origen, String destino) {
        
     int ticketsHoy = contarTicketsHoy(documento);
    if (ticketsHoy >= 3) {
        System.out.println("Ya tiene 3 tickets hoy (" + ticketsHoy + ")");
        return;
    }
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
       
        if (esFestivo(fecha)) {
        tarifa *= 1.20;
        System.out.println("Tarifa incrementada por festivo");
    }
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
    public void filtrarPorFecha(String fecha) {

    ticketDAO.listarTickets().forEach(t -> {
        String[] d = t.split(";");

        if (d[3].equals(fecha))
            System.out.println(t);
         });
     }
    public void filtrarPorVehiculo(String placa) {
    ticketDAO.listarTickets().forEach(t -> {
        if (t.contains(";" + placa + ";"))
            System.out.println(t);
    });
    }
    
    public void filtrarPorPasajero(String documento) {
    ticketDAO.listarTickets().forEach(t -> {

        if (t.contains(";" + documento + ";"))
            System.out.println(t);
         });
     }
     public void verDetalleTicket(String id) {
    
         String ticket = ticketDAO.buscarTicket(id);
        if (ticket == null) {
            System.out.println("Ticket no encontrado");
            return;
        }
        String[] t = ticket.split(";");
        
        System.out.println("====== DETALLE DEL TICKET ======");
        System.out.println("ID: " + t[0]);
        System.out.println("Pasajero: " + t[1]);
        System.out.println("Vehículo: " + t[2]);
        System.out.println("Fecha: " + t[3]);
        System.out.println("Origen: " + t[4]);
        System.out.println("Destino: " + t[5]);
        System.out.println("Valor Final: $" + t[6]);
    }
     private int contarTicketsHoy(String documento) {

    int contador = 0;
    String hoy = java.time.LocalDate.now().toString();

    for (String t : ticketDAO.listarTickets()) {

        String[] datos = t.split(";");

        if (datos[1].equals(documento) && datos[3].equals(hoy)) {
            contador++;
        }
    }

    return contador;
}
         private boolean esFestivo(String fecha) {

    String[] festivos = {
        "2026-01-01",
        "2026-12-25",
        "2026-07-20"
    };

    for (String f : festivos) {
        if (f.equals(fecha)) return true;
    }

    return false;
}
}
