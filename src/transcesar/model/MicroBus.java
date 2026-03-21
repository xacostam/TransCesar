/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transcesar.model;

public class MicroBus extends Vehiculo {

    private int tarifaBase = 10000;

    public MicroBus(String placa, String ruta, String estado) {
        super(placa, ruta, estado, 25);
    }

    public int getTarifaBase() {
        return tarifaBase;
    }
}
