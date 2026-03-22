/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transcesar.model;

public class Reserva {
    private String id;
    private String documento;
    private String placa;
    private String fecha;
    private String estado;

    public Reserva(String id, String documento, String placa, String fecha, String estado) {

        this.id = id;
        this.documento = documento;
        this.placa = placa;
        this.fecha = fecha;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return id + ";" + documento + ";" + placa + ";" + fecha + ";" + estado;
    }
}

