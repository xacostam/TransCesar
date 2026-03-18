/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transcesar.dao;

<<<<<<< HEAD
<<<<<<< HEAD
import java.io.BufferedReader;
import java.io.File;
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
   
=======
import java.io.FileWriter;
import java.io.IOException;
=======
import java.io.*;
import java.util.*;
>>>>>>> 6dc9b94 (feat:se creo el metodo listarAuto)

public class VehiculoDao {
>>>>>>> 499ed3f (feat: se creo la clase vehiculoDao y el metodo registrarAuto)
    public void registrarAuto(String archivo, String datos) {

        try {
            FileWriter fw = new FileWriter(archivo, true);
            fw.write(datos + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Error guardando vehículo");
        }

    }
<<<<<<< HEAD
<<<<<<< HEAD
    
=======
>>>>>>> 6dc9b94 (feat:se creo el metodo listarAuto)
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
    
    public String buscarAuto(String archivo, String placa) {
<<<<<<< HEAD

        try {

=======
        try {
>>>>>>> 6dc9b94 (feat:se creo el metodo listarAuto)
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;

            while ((linea = br.readLine()) != null) {

                if (linea.contains(placa)) {
                    br.close();
                    return linea;
                }
<<<<<<< HEAD

            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error buscando vehículo");
        }

        return null;
    }
    public void cambiarEstado(String archivo, String placa, String nuevoEstado) {

        try {

            File file = new File(archivo);
            List<String> lineas = new ArrayList<>();

            BufferedReader br = new BufferedReader(new FileReader(file));
            String linea;

            while ((linea = br.readLine()) != null) {

                if (linea.contains(placa)) {

                    String[] datos = linea.split(";");
                    datos[2] = nuevoEstado;

                    linea = String.join(";", datos);
                }

                lineas.add(linea);
            }

            br.close();

            FileWriter fw = new FileWriter(file);

            for (String l : lineas) {
                fw.write(l + "\n");
            }

            fw.close();

        } catch (IOException e) {

            System.out.println("Error cambiando estado");

        }

    }
    
    
=======
>>>>>>> 499ed3f (feat: se creo la clase vehiculoDao y el metodo registrarAuto)
=======
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error buscando vehículo");
        }
        return null;
    }
<<<<<<< HEAD
>>>>>>> 6dc9b94 (feat:se creo el metodo listarAuto)
=======
    
     public void cambiarEstado(String archivo, String placa, String nuevoEstado) {
         
        try {
            File file = new File(archivo);
            List<String> lineas = new ArrayList<>();

            BufferedReader br = new BufferedReader(new FileReader(file));
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.contains(placa)) {
                    String[] datos = linea.split(";");
                    datos[2] = nuevoEstado;
                    linea = String.join(";", datos);
                }
                lineas.add(linea);
            }
            br.close();
            FileWriter fw = new FileWriter(file);
            for (String l : lineas) {
                fw.write(l + "\n");
            }
            fw.close();
        } catch (IOException e) {

            System.out.println("Error cambiando estado");
        }
    }
>>>>>>> 72da723 (feat:se creo el metodo cambiarestados)
}
