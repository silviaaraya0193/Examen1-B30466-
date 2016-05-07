/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salvador;

import Modelo.Gestionador;
import Utilidades.AyudanteOS;
import Utilidades.Escritor;
import Utilidades.Lector;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Silvia Araya J
 */
public class SalvadorXML {
     private Escritor escritor;
    private AyudanteOS ayudaos;

    public SalvadorXML() {
        escritor = new Escritor();
        ayudaos = new AyudanteOS();
    }
    
   
    public void guardaPersona(ArrayList<Gestionador> gasolinera) {
        try {
            escritor.with_obj_in_file_xml(
                    ayudaos.get_config_file("persona.xml"),
                    gasolinera);
        } catch (IOException ex) {
            Logger.getLogger(SalvadorXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
   
    public ArrayList<Gestionador> obtenerPersonas() {
        Lector<ArrayList<Gestionador>> lector = new Lector<>();
        String filepath=null;
        try {
            filepath = ayudaos.get_config_file("persona.xml");
        } catch (IOException ex) {
            Logger.getLogger(SalvadorXML.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lector.read_xml(filepath);       
    }
      public void guardaPais(ArrayList<Gestionador> vehiculo) {
        try {
            escritor.with_obj_in_file_xml(
                    ayudaos.get_config_file("vehiculo.xml"),
                    vehiculo);
        } catch (IOException ex) {
            System.out.println("Error en guardar");
        }
    }
      public ArrayList<Gestionador> obtenerVehiculos() {
        Lector<ArrayList<Gestionador>> lector = new Lector<>();
        String filepath=null;
        try {
            filepath = ayudaos.get_config_file("vehiculo.xml");
        } catch (IOException ex) {
            System.out.println("Error en obtener");
        }
        return lector.read_xml(filepath);       
    }
}
