/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfgranhotel.vistas;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pfgranhotel.accesoDatos.*;
import pfgranhotel.entidades.*;

/**
 *
 * @author HP
 */
public class Factura extends javax.swing.JInternalFrame {
private DefaultTableModel modelo;
   private HuespedData hues;
   private ReservaData res;
   private HabitacionData hab;
   private ArrayList<Reserva> re;
   private ArrayList<Huesped>hu;
   private ArrayList<Habitacion>ha;
    public Factura() {
        initComponents();
        hues=new HuespedData();
        res=new ReservaData();
        hab=new HabitacionData();
        modelo=new DefaultTableModel();
        ha=hab.listarHabitaciones();
        hu=hues.listarHuesped();
        re=res.listarR();
         armarTabla();
        cargarHabitaciones();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jDCHIN = new com.toedter.calendar.JDateChooser();
        jDChOut = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLResultado = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();
        jRvisa = new javax.swing.JRadioButton();
        jRmaster = new javax.swing.JRadioButton();
        jRclub = new javax.swing.JRadioButton();
        jRefectivo = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jCdni = new javax.swing.JComboBox<>();

        jTextField1.setText("jTextField1");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Facturación");

        jLabel2.setText("Check In");

        jLabel3.setText("Check Out");

        jLabel4.setText("DNI Cliente");

        jLabel5.setText("Total");

        jLResultado.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRvisa);
        jRvisa.setText("VISA 10% descuento");

        buttonGroup1.add(jRmaster);
        jRmaster.setText("MASTER  5% descuento");

        buttonGroup1.add(jRclub);
        jRclub.setText("CLUB JAVA 25% descuento");
        jRclub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRclubActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRefectivo);
        jRefectivo.setText("EFECTIVO 20% descuento");
        jRefectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRefectivoActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jCdni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCdniMouseClicked(evt);
            }
        });
        jCdni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCdniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(79, 79, 79)
                                .addComponent(jCdni, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel2)
                                        .addGap(53, 53, 53)
                                        .addComponent(jDCHIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRclub)
                                            .addComponent(jRmaster))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jRefectivo)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jBSalir)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jDChOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(213, 213, 213)
                                            .addComponent(jRvisa)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDCHIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(126, 126, 126)
                        .addComponent(jLResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRefectivo)
                            .addComponent(jRclub))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBSalir, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRmaster)
                                    .addComponent(jRvisa))
                                .addGap(46, 46, 46)
                                .addComponent(jLabel5)
                                .addGap(49, 49, 49))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDChOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jRclubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRclubActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRclubActionPerformed

    private void jRefectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRefectivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRefectivoActionPerformed

    private void jCdniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCdniMouseClicked
   borrarFilas();
      reservaxdni();
    }//GEN-LAST:event_jCdniMouseClicked

    private void jCdniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCdniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCdniActionPerformed
private void calcularDia(){
    
    
    
}
  private void armarTabla() {
        ///seteamos cada columna para q aparezcan los sig titulos.
        modelo.addColumn("Idreserva");
        modelo.addColumn("huesped");
        modelo.addColumn("habitacion");
        modelo.addColumn("cantidad de personas");
        modelo.addColumn("precio");
        jTable1.setModel(modelo);
    }
 private void borrarFilas() {
        int ind = modelo.getRowCount() - 1;
        for (int i = ind; i > -1; i--) {
            modelo.removeRow(i);
        }
    }
     private void cargarHabitaciones() {

        for (Huesped tipo : hu) {
            jCdni.addItem(tipo);
        }

   }
public void reservaxdni() {
  Huesped a=(Huesped)jCdni.getSelectedItem();
    re = (ArrayList) res.habitacionxHuesped(a.getIdHuesped());
    for (Reserva reserva : re) {
        modelo.addRow(new Object[]{reserva.getIdReserva()});
    }
   
        
    
   

    
      
    

 }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Huesped> jCdni;
    private com.toedter.calendar.JDateChooser jDCHIN;
    private com.toedter.calendar.JDateChooser jDChOut;
    private javax.swing.JLabel jLResultado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRclub;
    private javax.swing.JRadioButton jRefectivo;
    private javax.swing.JRadioButton jRmaster;
    private javax.swing.JRadioButton jRvisa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
