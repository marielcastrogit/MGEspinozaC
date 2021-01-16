/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class Empleado implements Serializable{
    private String primerNombre, segundoNombre, primerApellido, segundoApellido, oficio;
    private Object fechaContrato, 
            fechaNacimiento,
            añosExperiencia;
    
   

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public Object getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Object fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public Object getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(Object fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public Object getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(Object añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
    
    
}
