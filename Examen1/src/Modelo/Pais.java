/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Silvia Araya J
 */
public class Pais {
    private int cantidad_Recibidos;
    private String paisOrigen;
    private String paisProcedencia;
    private String idPais;
    
    public Pais(int cantidad_Recibidos, String paisOrigen, String paisProcedencia,String idPais){
        this.cantidad_Recibidos = 70;
        this.paisOrigen = paisOrigen;
        this.paisProcedencia = paisProcedencia;
        this.idPais = idPais;
    }

    public Pais() {
    }

    public int getCantidad_Recibidos() {
        return cantidad_Recibidos--;
    }

    public void setCantidad_Recibidos(int cantidad_Recibidos) {
        this.cantidad_Recibidos = cantidad_Recibidos;
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

    public String getIdPais() {
        return idPais;
    }

    public void setIdPais(String idPais) {
        this.idPais = idPais;
    }
    
    
    
}
