/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transcesar.model;

public class Ticket {
    
    private String id;
    private String documentoPasajero;
    private String placaVehiculo;
    private String fecha;
    private String origen;
    private String destino;
    private double valorFinal;

    public Ticket(String id, String documentoPasajero, String placaVehiculo,
                  String fecha, String origen, String destino, double valorFinal) {

        this.id = id;
        this.documentoPasajero = documentoPasajero;
        this.placaVehiculo = placaVehiculo;
        this.fecha = fecha;
        this.origen = origen;
        this.destino = destino;
        this.valorFinal = valorFinal;
    }

    public String toString() {
        return id + ";" + documentoPasajero + ";" + placaVehiculo + ";" +
               fecha + ";" + origen + ";" + destino + ";" + valorFinal;
    }

    public void imprimirDetalle() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

