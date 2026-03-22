/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transcesar.service;

import java.io.BufferedReader;
import java.io.FileReader;
import transcesar.dao.ReservaDao;
import transcesar.model.Reserva;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import transcesar.service.TicketService;

public class ReservaService {
  ReservaDao dao = new ReservaDao();
  
    public void crearReserva(String id, String documento, String placa) {
        String fecha = LocalDate.now().toString();
        Reserva r = new Reserva(id, documento, placa, fecha, "ACTIVA");
        dao.guardar(r.toString());
        System.out.println("Reserva creada");
    }   
    public void confirmarReserva(String id) {

        List<String> nuevasLineas = new ArrayList<>();
        boolean encontrada = false;
        try {
            BufferedReader br = new BufferedReader(new FileReader("reservas.txt"));
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                if (datos[0].equals(id)) {
                    datos[4] = "CONFIRMADA";
                    linea = String.join(";", datos);
                    encontrada = true;
                }
                nuevasLineas.add(linea);
            }
            br.close();
            dao.actualizarReservas(nuevasLineas);
            if (encontrada)
                System.out.println("Reserva confirmada");
            else
                System.out.println("Reserva no encontrada");
        } catch (Exception e) {
            System.out.println("Error confirmando reserva");
        }
    }
    public void cancelarReserva(String id) {
        List<String> nuevasLineas = new ArrayList<>();
        boolean encontrada = false;
        try {
            BufferedReader br = new BufferedReader(new FileReader("reservas.txt"));
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(";");
                if (datos[0].equals(id)) {

                    datos[4] = "CANCELADA";
                    linea = String.join(";", datos);
                    encontrada = true;
                }
                nuevasLineas.add(linea);
            }
            br.close();
            dao.actualizarReservas(nuevasLineas);
            if (encontrada)
                System.out.println("Reserva cancelada");
            else
                System.out.println("Reserva no encontrada");
        } catch (Exception e) {
            System.out.println("Error cancelando reserva");
        }
    }
    public void historialReservasPorPasajero(String documento) {

    boolean encontrado = false;

    for (String r : dao.listar()) {

        String[] datos = r.split(";");

        if (datos[1].equals(documento)) {

            System.out.println("ID: " + datos[0]);
            System.out.println("Vehículo: " + datos[2]);
            System.out.println("Fecha: " + datos[3]);
            System.out.println("Estado: " + datos[4]);
            System.out.println("---------------------------");

            encontrado = true;
        }
    }

    if (!encontrado)
        System.out.println("No hay reservas para este pasajero");
}
    public void convertirReservaATicket(String idReserva) {
    List<String> nuevasLineas = new ArrayList<>();
    boolean encontrada = false;
    TicketService ticketService = new TicketService();
    try {

        BufferedReader br = new BufferedReader(new FileReader("reservas.txt"));
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(";");
            if (datos[0].equals(idReserva)) {
                encontrada = true;
                if (!datos[4].equals("ACTIVA")) {
                    System.out.println("La reserva no está activa");
                    nuevasLineas.add(linea);
                    continue;
                }
                String documento = datos[1];
                String placa = datos[2];
                ticketService.venderTicket(
                        "T" + System.currentTimeMillis(), 
                        documento,
                        placa,
                        "Origen",   
                        "Destino"
                );
                datos[4] = "CONFIRMADA";
                linea = String.join(";", datos);
            }
            nuevasLineas.add(linea);
        }
        br.close();
        dao.actualizarReservas(nuevasLineas);
        if (encontrada)
            System.out.println("Reserva convertida en ticket");
        else
            System.out.println("Reserva no encontrada");
    } catch (Exception e) {
        System.out.println("Error convirtiendo reserva");
    }
 }
}
