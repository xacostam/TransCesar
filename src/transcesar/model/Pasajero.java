/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transcesar.model;

import java.time.LocalDate;
import java.time.Period;

public abstract class Pasajero {

    protected String nombre;
    protected String documento;
    protected LocalDate fechaNacimiento;
    protected double descuento;

    public Pasajero(String nombre, String documento, LocalDate fechaNacimiento) {

        this.nombre = nombre;
        this.documento = documento;
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