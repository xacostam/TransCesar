/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transcesar.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author xavia
 */
public class VehiculoDao {
   
    public void registrarAuto(String archivo, String datos) {

        try {
            FileWriter fw = new FileWriter(archivo, true);
            fw.write(datos + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Error guardando vehículo");
        }

    }
    
    public List<String> listarAuto(String archivo) {

        List<String> lista = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;

            while ((linea = br.readLine()) != null) {
                lista.add(linea);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error leyendo archivo");
        }

        return lista;
    }
    
    
}
