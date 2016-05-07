/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Gestionador;
import Modelo.Pais;
import Modelo.Persona;
import Salvador.SalvadorXML;
import Utilidades.Escritor;
import Utilidades.Lector;
import Vista.VistaMigracion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Silvia Araya J
 */
public class ControladorMigracion implements ActionListener {

    private VistaMigracion vista;
    private Gestionador<Pais> gestionPais;
    private Gestionador<Persona> gestionPersona;
    private Persona persona;
    private String nombre;
    private Lector lector;
    private Escritor escritor;
   private Object aux;

    public ControladorMigracion(VistaMigracion vista) {
        this.vista = vista;
        this.gestionPais = new Gestionador<Pais>();
        this.gestionPersona = new Gestionador<Persona>();
        this.nombre = "datos.xml";
        this.lector = new Lector();
        this.escritor = new Escritor();
//        gestionPais.setArray((ArrayList) lector.read_xml(nombre));
//        gestionPersona.setArray((ArrayList) lector.read_xml(nombre));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("Agregar Persona")) {
            gestionPersona.guardarPersona(vista.getSeleccion(), vista.getId(), vista.getPaisOrigen(), vista.getPaisProcedencia(), vista.getPaisNacimiento());
            gestionPais.guardarPais(Integer.parseInt(vista.getAdmitidos()), vista.getPaisOrigen(), vista.getPaisProcedencia(), vista.getId());
            vista.setMensajes("Agregado con exito");
            
            //guardar_en_archivo(nombre);
            vista.set_PaisOrigenCombo(gestionPais);
            vista.set_PaisProcedenciaCombo(gestionPais);
            vista.limpiarTxt();

        } else if (e.getActionCommand().equalsIgnoreCase("Solicitar")) {
            System.out.println("entra al solicitar");
            /*  if(gestionarSolicitud(persona)){
                System.out.println("Solicitud aceptada");
            } else{
                System.out.println("Solicitud negada");
            }
             */
            for (int index = 0; index < gestionPersona.arregloPersona().size(); index++) {
                //System.out.println("Posicion 0 "+gestionPersona.arreglo().get(0).toString());
                if(gestionPersona.arregloPersona().get(index)!=null){ 
                    System.out.println("Dios no esta muerto, el vive y esta aqui programando"); 
                    if (gestionPersona.regresaArray(index).ingresoAlPais(vista.getTXTSolicitud())) { 
                        
                    System.out.println("Entra en el if de verificacion del controlador, cochino este, el mas rapido");
                }//fin del if
                }
            }

        } else if (e.getActionCommand().equalsIgnoreCase("Simular")) {
            if (gestionPais.size() > 0) {
                vista.setMensajes("Inicio el ciclo");
                //ciclo
                //vista.setCambios("" + cicloMigracion());

            } else {
                vista.setMensajes("Debe existir al menos uno");
            }
        } else if (e.getActionCommand().equalsIgnoreCase("Salir")) {
            JOptionPane.showMessageDialog(null, "Examen I.\nProgramacion II.\nSilvia Araya Jimenez.\nB30466.\n2016.");
//            escritor.with_obj_in_file_xml(nombre, gestionPais.arreglo());
//            escritor.with_obj_in_file_xml(nombre, gestionPersona.arreglo());
//            guardar_en_archivo(nombre);
            System.exit(0);
        }
    }

//    public int cicloMigracion() {
//        int ciclo = 0;
//        int z = 0;
//        boolean aceptado = true;
//        while (aceptado) {
//            for (int i = 0; i < gestion.size() && aceptado; i++) {
//                if (persona.ingresoAlPais(vista.getId())) {
//                    z = z % gestion.size();
//                } else {
//                    aceptado = false;
//                }
//                ciclo++;
//            }//fin del for
//        }//fin del while
//        return ciclo;
//    }

    private void guardar_en_archivo(String formato) {
        SalvadorXML salvador = new SalvadorXML();

        salvador.guardaPersona(gestionPersona.arreglo());
        salvador.guardaPais(gestionPais.arreglo());
    }

}
