/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transcesar.model;

public abstract class Pasajero extends Persona {
    
    protected double descuento;
    public Pasajero(String nombre, String documento) {
        super(nombre, documento);
    }
    public double getDescuento() {
        return descuento;
    }
}
