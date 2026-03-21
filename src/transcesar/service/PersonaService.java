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
}
