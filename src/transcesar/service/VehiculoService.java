/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transcesar.service;

import transcesar.dao.VehiculoDao;
public class VehiculoService {

    VehiculoDao dao = new VehiculoDao();

    public void registrarAuto(String archivo, String placa, String ruta, String estado, int capacidad) {

        String datos = placa + ";" + ruta + ";" + estado + ";" + capacidad;

        dao.registrarAuto(archivo, datos);
    }

    public void listarAuto(String archivo) {

        dao.listarAuto(archivo).forEach(System.out::println);
    }

    public void buscarAuto(String archivo, String placa) {

        String resultado = dao.buscarAuto(archivo, placa);

        if (resultado != null)
            System.out.println(resultado);
        else
            System.out.println("Vehículo no encontrado");
    }

    public void cambiarEstado(String archivo, String placa, String estado) {

        dao.cambiarEstado(archivo, placa, estado);
    }
}
