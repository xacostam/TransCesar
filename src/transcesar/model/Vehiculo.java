
package transcesar.model;


public abstract class  Vehiculo {
    protected String placa;
    protected Ruta ruta;
    protected String estado;
    protected int capacidad;
    
   public Vehiculo(String placa, Ruta ruta, String estado, int capacidad) {
    this.placa = placa;
    this.ruta = ruta;
    this.estado = estado;
    this.capacidad = capacidad;
}

    public String getPlaca() {
        return placa;
    }

    public String getRuta() {
        return ruta;
    }

    public String getEstado() {
        return estado;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
