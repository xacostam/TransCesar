/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transcesar.model;

public class PasajeroAdultoMayor extends Pasajero {

    public PasajeroAdultoMayor(String nombre, String documento) {
        super(nombre, documento);
        this.descuento = 0.3;
    }    
}
