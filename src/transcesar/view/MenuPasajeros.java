/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transcesar.view;

import java.util.Scanner;
import transcesar.service.PersonaService;


public class MenuPasajeros {
    private  PersonaService service;
    private  Scanner        sc;

    public MenuPasajeros(PersonaService service, Scanner sc) {
        this.service = service;
        this.sc = sc;
    }

}
