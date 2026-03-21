
package transcesar.model;


public class Buseta extends Vehiculo {

    private int tarifaBase = 8000;

    public Buseta(String placa, String ruta, String estado) {
        super(placa, ruta, estado, 19);
    }

    public int getTarifaBase() {
        return tarifaBase;
    }
}