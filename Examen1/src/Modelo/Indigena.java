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
public class Indigena implements Persona {

    private String id;
    private int numDias;
    private String paisOrigen;
    private String paisProcedencia;
    private VistaMigracion vista;
    private String paisNacimiento;
    private Gestionador gestiona;

    public Indigena(String id, String paisOrigen, String paisProcedencia, String paisNacimiento) {
        this.id = id;
        this.numDias = 0;
        this.paisOrigen = paisOrigen;
        this.paisProcedencia = paisProcedencia;
        this.paisNacimiento = paisNacimiento;
        this.gestiona = new Gestionador();
    }

    public Indigena() {
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

    public void setNumDias(int numDias) {
        this.numDias = numDias;
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

    @Override
    public boolean ingresoAlPais(String id) {
        if (gestiona.buscarIDPersona(id)) {//di el id existe
            if (vista.disminuirValores() > 0) {
                numDias = -1;
                return true;
            }
        }
        return false;
    }
    
    public String getIDPersona(){
    
        return id;
    }

}
