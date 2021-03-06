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
public class Fabrica_Metodos {
    private Persona persona;
    
    public Persona getPersona(String nombre,String id,String paisOrigen,String paisProcedencia,String paisNacimiento){
        
        switch(nombre){
            case "Ciudadano":
                persona = new Ciudadano(id, paisOrigen, paisProcedencia,paisNacimiento,false);
                break;
            case "Indigena":
                persona = new Indigena(id,paisOrigen, paisProcedencia,paisNacimiento,false);
                break;
            case "Migrantes":
                persona = new Migrante(id,paisOrigen, paisProcedencia,paisNacimiento,false);
                break;
            case "Refugiado":
                persona = new Refugiado(id,paisOrigen, paisProcedencia,paisNacimiento,false);
                break;
        }
        return persona;
    }
}
