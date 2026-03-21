
package transcesar.model;

public class Ruta {
    
    private String codigo;
    private String origen;
    private String destino;
    private double distanciaKm;
    private int tiempoMin;

    public Ruta(String codigo, String origen, String destino,
                double distanciaKm, int tiempoMin) {

        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.distanciaKm = distanciaKm;
        this.tiempoMin = tiempoMin;
    }
    public String getCodigo() { return codigo; }
    public String getOrigen() { return origen; }
    public String getDestino() { return destino; }
    public double getDistanciaKm() { return distanciaKm; }
    public int getTiempoMin() { return tiempoMin; }

    @Override
    public String toString() {
        return codigo + ";" + origen + ";" + destino + ";" + distanciaKm + ";" + tiempoMin;
    }
}
