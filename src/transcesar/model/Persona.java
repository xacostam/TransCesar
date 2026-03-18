/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transcesar.model;

/**
 *
 * @author xavia
 */
public abstract class Persona {
    
    protected String nombre;
    protected String documento;
    
    public Persona(String nombre, String documento) {
        this.nombre = nombre;
        this.documento = documento;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDocumento() {
        return documento;
    }
}

