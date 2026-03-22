/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transcesar.service;

import transcesar.dao.PersonaDao;

public class PersonaService {
     PersonaDao dao = new PersonaDao();
    public void registrarPasajero(String tipo, String nombre, String documento, double descuento) {

        String datos = tipo + ";" + nombre + ";" + documento + ";" + descuento;

        dao.registrarPasajero(datos);
    }
    public void listarPasajeros() {

        dao.listarPasajeros().forEach(System.out::println);
    }
     public void buscarPasajero(String documento) {

        String resultado = dao.buscarPasajero(documento);

        if (resultado != null)
            System.out.println(resultado);
        else
            System.out.println("Pasajero no encontrado");
    }
     public void registrarConductor(String cedula, String nombre,  String num_licencia, String cate_licencia) {

        String datos = cedula+ ";" + nombre + ";" + num_licencia + ";" + cate_licencia+ ";";

        dao.registrarConductor(datos);
    }
    public void listarConductor() {

        dao.listarConductor().forEach(System.out::println);
    }
     public void buscarConductor(String cedula) {

        String resultado = dao.buscarConductor(cedula);

        if (resultado != null)
            System.out.println(resultado);
        else
            System.out.println("Conductor no encontrado");
    }
}
