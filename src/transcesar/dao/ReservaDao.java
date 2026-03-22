/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transcesar.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class ReservaDao {
     String archivo = "reservas.txt";

    public void guardar(String datos) {

        try {
            FileWriter fw = new FileWriter(archivo, true);
            fw.write(datos + "\n");
            fw.close();
        } catch (Exception e) {}
    }
    public List<String> listar() {
        List<String> lista = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String l;
            while ((l = br.readLine()) != null)
                lista.add(l);
        } catch (Exception e) {}
        return lista;
    }
}
