/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Silvia Araya J
 */
public class Gestionador<T> {

    private ArrayList<T> arrayT;
    private Fabrica_Metodos fabrica;

    public Gestionador() {
        arrayT = new ArrayList<>();
        fabrica = new Fabrica_Metodos();
    }

    public void guardarPersona(String nombre, String id,  String paisOrigen, String paisProcedencia,String paisNacimiento) {
       
        arrayT.add((T) fabrica.getPersona(nombre, id,paisOrigen, paisProcedencia,paisNacimiento));
        System.out.println("agrego personas");
    }

    public void guardarPais(int cantidad_Recibidos, String paisOrigen, String paisProcedencia, String idPais) {
        arrayT.add((T) new Pais(cantidad_Recibidos, paisOrigen, paisProcedencia, idPais));
    }
   
    public T buscarPorID(String id) throws Exception {
        T aux = null;
        for (int i = 0; i < arrayT.size(); i++) {
            if (arrayT.get(i).equals(id)) {
                aux = arrayT.get(i);
            } else {
                throw new Exception("El id ingresado no ha sido registrado");
            }
        }
        return aux;
    }
    
    public Pais getPaisO(){
        Pais pais = null;
        for(int i =0; i<arrayT.size();i++){
            pais = (Pais) arrayT.get(i);
        }
        return pais;
    }
    public int size() {
        return arrayT.size();
    }

    public T regresaArray(int posc) {
        return arrayT.get(posc);
    }

    public ArrayList arreglo() {
        return arrayT;
    }
    public ArrayList<Persona> arregloPersona(){
        return (ArrayList<Persona>) arrayT;
    }
 
    public void setArray(ArrayList array) {
        if (array != null) {
            arrayT = array;
        }
    }
   
   
}