/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_jarodzuniga;

import java.util.ArrayList;

/**
 *
 * @author Jhon Zuniga
 */
public class Escuadrones {
    protected String nombre;
    protected String lugar;
    protected String lider;
    protected String tipo;
    ArrayList<supers> conte=new ArrayList();

    public Escuadrones() {
    }

    public Escuadrones(String nombre, String lugar, String lider, String tipo) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.lider = lider;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", lugar=" + lugar + ", lider=" + lider + ", tipo=" + tipo;
    }
    
}
