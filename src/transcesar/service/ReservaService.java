/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transcesar.service;

import transcesar.dao.ReservaDao;
import transcesar.model.Reserva;
import java.time.LocalDate;

public class ReservaService {
  ReservaDao dao = new ReservaDao();

    public void crearReserva(String id, String documento, String placa) {
        String fecha = LocalDate.now().toString();
        Reserva r = new Reserva(id, documento, placa, fecha, "ACTIVA");
        dao.guardar(r.toString());
        System.out.println("Reserva creada");
    }   
}
