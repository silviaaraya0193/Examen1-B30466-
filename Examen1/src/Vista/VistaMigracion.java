/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorMigracion;
import Modelo.Ciudadano;
import Modelo.Gestionador;
import Modelo.Indigena;
import Modelo.Migrante;
import Modelo.Pais;
import Modelo.Refugiado;
import java.util.ArrayList;
import javax.swing.ButtonGroup;

/**
 *
 * @author Silvia Araya J
 */
public class VistaMigracion extends javax.swing.JFrame {

    /**
     * Creates new form VistaMigracion
     */
    
    private int solicita;
    private int numero;
    
    public VistaMigracion() {
        initComponents();
        this.setLocationRelativeTo(null);
        ButtonGroup group = new ButtonGroup();
        group.add(radio_ciudadano);
        group.add(radio_indigena);
        group.add(radio_migrante);
        group.add(radio_refugiado);
        group.add(radio_zonaIndigena);
        radio_ciudadano.setSelected(true);
        ControladorMigracion control = new ControladorMigracion(this);
        btn_agregar.addActionListener(control);
        btn_salir.addActionListener(control);
        btn_simular.addActionListener(control);
        btn_solicitud.addActionListener(control);
        
        this.solicita = 0;
        this.numero = 0;
    }

    public String getSeleccion() {
        String nombre = "";
        if (radio_ciudadano.isSelected()) {
            return nombre = "Ciudadano";
        } else if (radio_indigena.isSelected()) {
            return nombre = "Indigena";
        } else if (radio_migrante.isSelected()) {
            return nombre = "Migrante";
        } else if (radio_refugiado.isSelected()) {
            if (verificarRefugiado()) {
                return nombre = "Refugiado";
            } else{
                this.setMensajes("No puede viajar a su mismo pais de procedencia");
            }
        }
        return nombre;
    }

    public boolean verificarRefugiado() {
        if (txt_nacimiento.getText().equalsIgnoreCase(txt_procedencia.getText())) {
            return true;//los paises son iguales
        }
        return false;//los paises son diferentes.
    }

    public int numeroDias() {
        int numero = 0;
        if (radio_ciudadano.isSelected()) {
            numero = 30;
            return numero;
        } else if (radio_indigena.isSelected()) {
            numero = -1;
            return numero;
        } else if (radio_migrante.isSelected()) {
            numero = 10;
            return numero;
        } else if (radio_refugiado.isSelected()) {
            numero = 30;
            return numero;
        }
        return numero;
    }

    public String getPaisOrigen() {
        return txt_origen.getText();
    }

    public String getPaisProcedencia() {
        return txt_procedencia.getText();
    }

    public void setMensajes(String mensajes) {
        this.lbl_mensajes.setText(mensajes);
    }

    public void setUbicaion(String mensajes) {
        this.lbl_ubicacion.setText(mensajes);
    }

    public void setCambios(String mensajes) {
        this.lbl_mensajes.setText(mensajes);
    }

    public String getId() {
        return txt_id.getText();
    }

    public void limpiarTxt() {
        txt_origen.setText("");
        txt_procedencia.setText("");
        txt_nacimiento.setText("");
        txt_id.setText("");
    }

    public String getAdmitidos() {
        return txt_admitidos.getText();
    }
    public void setAdmitidos(String nume){
        this.txt_admitidos.setText(nume);
    }
    
    public int setSolicitud() {
        return solicita++;
    }

    public String getPaisNacimiento() {
        return txt_nacimiento.getText();
    }
    public int disminuirValores(){
        numero = Integer.parseInt(getAdmitidos());
        numero --;
        return numero;
    }
    
    public String getTXTSolicitud(){
        return txt_idSolicitud.getText();
    }
    public void set_PaisOrigenCombo(Gestionador<Pais> gestionPais) {
        this.combo_origen.removeAllItems();
        //System.out.println("informaionc del paisorigen: "+gestionPais.getPaisO().getPaisOrigen());
        this.combo_origen.addItem(gestionPais.getPaisO().getPaisOrigen());

    }

    public String get_PaisOrigenCombo() throws Exception {
        int pos = this.combo_origen.getSelectedIndex();
        if (pos == -1) {
            throw new Exception("Pais no seleccionado");
        }
        return this.combo_origen.getModel().getElementAt(pos);
    }

    public void set_PaisProcedenciaCombo(Gestionador<Pais> gestionPais) {
        this.combo_procedencia.removeAllItems();
        this.combo_procedencia.addItem(gestionPais.getPaisO().getPaisProcedencia());

    }

    public String get_PaisProcedenciaCombo() throws Exception {
        int pos = this.combo_procedencia.getSelectedIndex();
        if (pos == -1) {
            throw new Exception("Pais no seleccionado");
        }
        return this.combo_procedencia.getModel().getElementAt(pos);
    }

    public boolean getZonaIndigena() {
        return this.radio_zonaIndigena.isSelected();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        radio_ciudadano = new javax.swing.JRadioButton();
        radio_indigena = new javax.swing.JRadioButton();
        radio_migrante = new javax.swing.JRadioButton();
        radio_refugiado = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_origen = new javax.swing.JTextField();
        txt_procedencia = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_simular = new javax.swing.JButton();
        lbl_mensajes = new javax.swing.JLabel();
        combo_origen = new javax.swing.JComboBox<>();
        combo_procedencia = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        radio_zonaIndigena = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        lbl_ubicacion = new javax.swing.JLabel();
        lbl_cambios = new javax.swing.JLabel();
        btn_solicitud = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txt_admitidos = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_nacimiento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_idSolicitud = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Sistema de Migracion");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Seleccione su tipo:");

        radio_ciudadano.setText("Ciudadano");

        radio_indigena.setText("Indigena");

        radio_migrante.setText("Migrante");

        radio_refugiado.setText("Refugiado");

        jLabel3.setText("Pais De Procedencia:");

        jLabel4.setText("Pais De Destino:");

        txt_procedencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_procedenciaActionPerformed(evt);
            }
        });

        btn_agregar.setText("Agregar Persona");

        btn_salir.setText("Salir");

        btn_simular.setText("Simular");

        lbl_mensajes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_mensajes.setText("Mostrar mensajes");

        combo_origen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        combo_procedencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Seleccione su pais de procedencia");

        jLabel6.setText("Seleccione su pais de destino");

        radio_zonaIndigena.setText("Zona Indigena");

        jLabel7.setText("ID:");

        lbl_ubicacion.setText("Ubicacion actual de la persona");

        lbl_cambios.setText("Numero de intercambios");

        btn_solicitud.setText("Solicitar");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Ingrese el numero de solicitudes: ");

        jLabel9.setText("Pais De Nacimiento: ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Solicitar Permiso de Cruzar Frontera: ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radio_indigena)
                                    .addComponent(radio_ciudadano)
                                    .addComponent(radio_migrante)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(90, 90, 90)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_idSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addComponent(btn_solicitud)))
                                .addGap(0, 71, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(combo_procedencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(combo_origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radio_zonaIndigena)
                            .addComponent(lbl_ubicacion)
                            .addComponent(lbl_cambios))
                        .addGap(214, 214, 214))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radio_refugiado)
                                        .addGap(103, 103, 103)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel9))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                            .addComponent(txt_nacimiento, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txt_origen, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txt_procedencia, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addComponent(jLabel10))
                                .addGap(15, 15, 15))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(jLabel7)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(lbl_mensajes, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(btn_agregar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_salir)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(68, 68, 68)
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txt_admitidos, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_simular)
                        .addGap(272, 272, 272))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txt_admitidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(radio_ciudadano)
                        .addGap(18, 18, 18)
                        .addComponent(radio_indigena)
                        .addGap(18, 18, 18)
                        .addComponent(radio_migrante)
                        .addGap(18, 18, 18)
                        .addComponent(radio_refugiado))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_mensajes)
                                .addGap(10, 10, 10)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txt_nacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txt_origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txt_procedencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(btn_agregar)))))
                .addGap(58, 58, 58)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_idSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_solicitud))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_salir)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(radio_zonaIndigena)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(combo_procedencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo_origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(2, 2, 2)
                        .addComponent(lbl_cambios)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_ubicacion)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btn_simular)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_procedenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_procedenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_procedenciaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaMigracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMigracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMigracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMigracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaMigracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_simular;
    private javax.swing.JButton btn_solicitud;
    private javax.swing.JComboBox<String> combo_origen;
    private javax.swing.JComboBox<String> combo_procedencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl_cambios;
    private javax.swing.JLabel lbl_mensajes;
    private javax.swing.JLabel lbl_ubicacion;
    private javax.swing.JRadioButton radio_ciudadano;
    private javax.swing.JRadioButton radio_indigena;
    private javax.swing.JRadioButton radio_migrante;
    private javax.swing.JRadioButton radio_refugiado;
    private javax.swing.JRadioButton radio_zonaIndigena;
    private javax.swing.JTextField txt_admitidos;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_idSolicitud;
    private javax.swing.JTextField txt_nacimiento;
    private javax.swing.JTextField txt_origen;
    private javax.swing.JTextField txt_procedencia;
    // End of variables declaration//GEN-END:variables
}
