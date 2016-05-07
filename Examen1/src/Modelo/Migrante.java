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
public class Migrante implements Persona{
    private String id;
    private int numDias;
    private String paisOrigen;
    private String paisProcedencia;
    private boolean estatus;
    private String paisNacimiento;
    private Gestionador gestion;
    private VistaMigracion vista;
    public Migrante(String id, String paisOrigen, String paisProcedencia,String paisNacimiento,boolean status){
        this.id = id;
        this.numDias = 0;
        this.paisOrigen = paisOrigen;
        this.paisProcedencia = paisProcedencia;
        this.estatus = status;
        this.paisNacimiento = paisNacimiento;
        this.gestion = new Gestionador();
        this.vista = new VistaMigracion();
    }

    public Migrante() {
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
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }
 
    
   public String getIDPersona(){
     return id;
    }

    @Override
    public void setEstado(boolean estado) {
        setEstatus(estado);
    }
    
}
