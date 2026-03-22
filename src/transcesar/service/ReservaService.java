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
}
