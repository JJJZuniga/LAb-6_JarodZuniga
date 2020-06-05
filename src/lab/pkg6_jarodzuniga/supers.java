/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_jarodzuniga;

/**
 *
 * @author Jhon Zuniga
 */
public class supers{
    protected String nombre, poder, debilidad, escuadron;
    protected int fuerza, agilidad_física,agilidad_menta;

    public supers(String nombre, String poder, String debilidad, String escuadron, int fuerza, int agilidad_física, int agilidad_menta) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.escuadron = escuadron;
        this.fuerza = fuerza;
        this.agilidad_física = agilidad_física;
        this.agilidad_menta = agilidad_menta;
    }

    public supers() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getEscuadron() {
        return escuadron;
    }

    public void setEscuadron(String escuadron) {
        this.escuadron = escuadron;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidad_física() {
        return agilidad_física;
    }

    public void setAgilidad_física(int agilidad_física) {
        this.agilidad_física = agilidad_física;
    }

    public int getAgilidad_menta() {
        return agilidad_menta;
    }

    public void setAgilidad_menta(int agilidad_menta) {
        this.agilidad_menta = agilidad_menta;
    }

    @Override
    public String toString() {
        return nombre + ", " + poder + "," + debilidad + ", "+ escuadron + "," + fuerza + ", " + agilidad_física + ", " + agilidad_menta;
    }
    
}
