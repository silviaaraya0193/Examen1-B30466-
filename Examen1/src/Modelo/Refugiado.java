/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.VistaMigracion;

/**
 *
 * @author Silvia Araya J
 */
public class Refugiado implements Persona{
    private String id;
    private int numDias;
    private String paisOrigen;
    private String paisProcedencia;
    private VistaMigracion vista;
    private int numeroSolicitud;
    private String paisNacimiento;
    private boolean status; 
    private Gestionador<Pais> gestiona;
    
    public Refugiado(String id, String paisOrigen, String paisProcedencia,String paisNacimiento,boolean status){
        this.id = id;
        this.numDias = 0;
        this.paisOrigen = paisOrigen;
        this.paisProcedencia = paisProcedencia;
        this.numeroSolicitud = numeroSolicitud;
        this.paisNacimiento = paisNacimiento;
        this.status = status;
        this.gestiona = new Gestionador<Pais>();
    }

    public Refugiado() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumDias() {
        return numDias;
    }

    public void setNumDias(int estatus) {
        this.numDias = estatus;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getPaisProcedencia() {
        return paisProcedencia;
    }

    public void setPaisProcedencia(String paisProcedencia) {
        this.paisProcedencia = paisProcedencia;
    }

    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    public void setPaisNacimiento(String paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
    }

    public boolean isEstatus() {
        return status;
    }

    public void setEstatus(boolean estatus) {
        this.status = estatus;
    }
    
   
  
    public static int fibonacci(int posicion) {
        int resultado = 0;
        if (posicion == 0) {
            resultado = 0;
        } else {
            if (posicion == 1) {
                resultado = 1;
            } else {
                if (posicion >= 2) {
                    resultado = fibonacci(posicion - 1) + fibonacci(posicion - 2);
                }
            }
        }
        return resultado;
    }
    
    public String getIDPersona(){
    return id;
    }

    @Override
    public void setEstado(boolean estado) {
        setEstatus(estado);
    }
    
}
