/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transcesar.dao;

import java.io.*;
import java.util.*;

public class TicketDao {
    String archivo = "tickets.txt";
    
    public void guardarTicket(String datos) {
        try {
            FileWriter fw = new FileWriter(archivo, true);
            fw.write(datos + "\n");
            fw.close();
        } catch (IOException e) {
            System.out.println("Error guardando ticket");
        }
    }
    public List<String> listarTickets() {
        List<String> lista = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = br.readLine()) != null)
                lista.add(linea);
            br.close();
        } catch (IOException e) {
            System.out.println("Error leyendo tickets");
        }
        return lista;
    }
    public String buscarTicket(String id) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.startsWith(id + ";"))
                    return linea;
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error buscando ticket");
        }
        return null;
    }
}

