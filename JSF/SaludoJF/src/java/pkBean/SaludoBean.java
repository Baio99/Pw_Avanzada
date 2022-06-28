/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkBean;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Fausto
 */
@Named(value = "saludoBean")
@RequestScoped
public class SaludoBean {
    // Atributos:
    private String nombre, saludo;
    
    // Metodos:
    public SaludoBean() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getSaludo() {
        return saludo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }
    
    public void procesar() {
        this.setSaludo("Hola como estas " + this.getNombre());
    }
    
}
