
package transcesar.model;

import java.time.LocalDate;
import java.time.Period;

public abstract class Pasajero extends Persona {
    
    public Pasajero(String nombre, String documento) {
        super(nombre, documento);
    }
     protected String nombre;
    protected String documento;
    protected LocalDate fechaNacimiento;
    protected double descuento;

    public Pasajero(String nombre, String documento, LocalDate fechaNacimiento) {
          super(nombre, documento);
        this.fechaNacimiento = fechaNacimiento;
        this.descuento = calcularDescuento();
    }

    private double calcularDescuento() {

        int edad = Period.between(fechaNacimiento, LocalDate.now()).getYears();

        if (edad >= 60) return 0.30; // adulto mayor
        return 0.0;
    }

    public double getDescuento() {
        return descuento;
    }
}