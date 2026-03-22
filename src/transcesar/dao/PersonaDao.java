/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transcesar.dao;

import java.io.*;
import java.util.*;

public class PersonaDao {
    String archivo = "pasajeros.txt";
    public void registrarPasajero(String datos) {
        try {
            FileWriter fw = new FileWriter(archivo, true);
            fw.write(datos + "\n");
            fw.close();
        } catch (IOException e) {
        }
    }
    public List<String> listarPasajeros() {
        List<String> lista = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = br.readLine()) != null)
                lista.add(linea);
            br.close();
        } catch (IOException e) {
        }
        return lista;
    }
    public String buscarPasajero(String documento) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = br.readLine()) != null) {

                if (linea.contains(documento))
                    return linea;
            }
        } catch (IOException e) {
        }
        return null;
    }
    public void registrarConductor(String datos) {
        try {
            FileWriter fw = new FileWriter(archivo, true);
            fw.write(datos + "\n");
            fw.close();
        } catch (IOException e) {
        }
    }
    public List<String> listarConductor() {
        List<String> lista = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = br.readLine()) != null)
                lista.add(linea);
            br.close();
        } catch (IOException e) {
        }
        return lista;
    }
    public String buscarConductor(String documento) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = br.readLine()) != null) {

                if (linea.contains(documento))
                    return linea;
            }
        } catch (IOException e) {
        }
        return null;
    }
}
