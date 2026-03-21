
package transcesar.model;


public class Bus extends Vehiculo {

    private int tarifaBase = 15000;

    public Bus(String placa, String ruta, String estado) {
        super(placa, ruta, estado, 45);
    }
    
    public int getTarifaBase() {
        return tarifaBase;
    }
}