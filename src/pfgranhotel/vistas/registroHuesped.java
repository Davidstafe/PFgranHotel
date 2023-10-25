/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pfgranhotel.vistas;

import javax.swing.JOptionPane;
import pfgranhotel.accesoDatos.*;
import pfgranhotel.entidades.*;

/**
 *
 * @author HP
 */
public class registroHuesped extends javax.swing.JInternalFrame {
private HuespedData hues;
    public registroHuesped() {
        initComponents();
        hues=new HuespedData();
        limpiar();
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
        jLabel1 = new javax.swing.JLabel();
        jLApellido = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTDocumento = new javax.swing.JTextField();
        jTApellido = new javax.swing.JTextField();
        jTDomicilio = new javax.swing.JTextField();
        jTNombre = new javax.swing.JTextField();
        jTCorreo = new javax.swing.JTextField();
        jTCelular = new javax.swing.JTextField();
        jBNuevo = new javax.swing.JButton();
        jBModifica = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jBuscar = new javax.swing.JButton();
        jRAlta = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jBLimpiar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Registro de Huéspedes ");

        jLApellido.setText("Apellido");

        jLabel4.setText("Nombre");

        jLabel5.setText("Correo");

        jLabel6.setText("Celular");

        jLabel8.setText("Domicilio");

        jTDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTDocumentoKeyTyped(evt);
            }
        });

        jTApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTApellidoKeyTyped(evt);
            }
        });

        jTDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDomicilioActionPerformed(evt);
            }
        });

        jTNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTNombreKeyTyped(evt);
            }
        });

        jTCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTCelularKeyTyped(evt);
            }
        });

        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBModifica.setText("Modificar");
        jBModifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificaActionPerformed(evt);
            }
        });

        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "Pasaporte" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jBuscar.setText("Buscar");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jRAlta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRAltaMouseClicked(evt);
            }
        });

        jLabel2.setText("Alta/Baja");

        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBNuevo)
                        .addGap(51, 51, 51)
                        .addComponent(jBModifica)
                        .addGap(56, 56, 56)
                        .addComponent(jBEliminar)))
                .addContainerGap(156, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLApellido)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRAlta)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTApellido)
                                    .addComponent(jTNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTCorreo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBLimpiar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBSalir))
                                    .addComponent(jTCelular))))
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBuscar))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLApellido)
                    .addComponent(jLabel5)
                    .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jRAlta))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo)
                    .addComponent(jBModifica)
                    .addComponent(jBEliminar)
                    .addComponent(jBSalir)
                    .addComponent(jBLimpiar))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDomicilioActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
        try {

            Huesped h = hues.buscarHuesped(Integer.parseInt(jTDocumento.getText()));
            if (h != null) {
                jTApellido.setText(h.getApellido());
                jTNombre.setText(h.getNombres());
                jTDomicilio.setText(h.getDomicilio());
                jTCorreo.setText(h.getCorreo());
                jTCelular.setText(h.getCelular() + "");//consultar porque tengo que poner comillas
                if (h.isEstado() == true) {
                    jRAlta.setSelected(true);//boton apretado cliente de alta
                } else {
                    jRAlta.setSelected(false);//boton no accionado cliente dado de baja
                }

                JOptionPane.showMessageDialog(null, "Huesped encontrado");

            } else {
                JOptionPane.showMessageDialog(this, "Huesped no encontrado");

            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresar numeros en el campo indicado" + e);
        }
//        limpiar();
    }//GEN-LAST:event_jBuscarActionPerformed
    
    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
//guarda huesped nuevo
        try {

            if (jTApellido.getText().isEmpty() || jTNombre.getText().isEmpty() || jTDomicilio.getText().isEmpty() || jTCelular.getText().isEmpty() || jTCorreo.getText().isEmpty() || jTDocumento.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Complete todos los campos");
            } else {
                Huesped h = new Huesped(Integer.parseInt(jTDocumento.getText()), jTApellido.getText(), jTNombre.getText(), jTDomicilio.getText(), jTCorreo.getText(), Integer.parseInt(jTCelular.getText()), jRAlta.isSelected());
                if (hues.buscarHuesped(Integer.parseInt(jTDocumento.getText())) == null) {

                    hues.guardarHuesped(h);

                    JOptionPane.showMessageDialog(null, "Huesped guardado");

                }

            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ingrese numeros en los campos correspondientes" + e);
            jTDocumento.setText("");
            jTCelular.setText("");
        } catch (Exception as) {
            JOptionPane.showMessageDialog(null, "Ingresar solo letras" + as);
            jTApellido.setText("");
            jTNombre.setText("");
        }


    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        Huesped h = hues.buscarHuesped(Integer.parseInt(jTDocumento.getText()));
        if (h != null) {
            hues.bajaHuesped(h.getDni());
            jRAlta.setSelected(false);
            JOptionPane.showMessageDialog(null, "Huesped eliminado");

        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBModificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificaActionPerformed
        try {

            Huesped h = hues.buscarHuesped(Integer.parseInt(jTDocumento.getText()));
            if (h != null) {
                h.setDni(Integer.parseInt(jTDocumento.getText()));
                h.setApellido(jTApellido.getText());
                h.setNombres(jTNombre.getText());
                h.setDomicilio(jTDomicilio.getText());
                h.setCorreo(jTCorreo.getText());
                h.setCelular(Integer.parseInt(jTCelular.getText()));
                h.setEstado(jRAlta.isSelected());
                hues.modificarHuesped(h);
                JOptionPane.showMessageDialog(null, "Huesped modificado");
            } else {
                JOptionPane.showMessageDialog(null, "Huesped no modificado");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresar numeros en los campos" + e);
            jTDocumento.setText("");
            jTCelular.setText("");

        }
    }//GEN-LAST:event_jBModificaActionPerformed

    private void jRAltaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRAltaMouseClicked

    }//GEN-LAST:event_jRAltaMouseClicked

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jTApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTApellidoKeyTyped
         int key = evt.getKeyChar();//no deja ingresar numeros

    boolean mayusculas = key >= 65 && key <= 90;
    boolean minusculas = key >= 97 && key <= 122;
    boolean espacio = key == 32;
            
     if (!(minusculas || mayusculas || espacio))
    {
        evt.consume();
    }
    
    }//GEN-LAST:event_jTApellidoKeyTyped

    private void jTDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTDocumentoKeyTyped
         int key = evt.getKeyChar();//no deja ingresar letras

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }

    if (jTDocumento.getText().trim().length() == 10) {
        evt.consume();
    }
    }//GEN-LAST:event_jTDocumentoKeyTyped

    private void jTCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTCelularKeyTyped
         int key = evt.getKeyChar();//no deja ingresar letras

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }

    if (jTCelular.getText().trim().length() == 10) {
        evt.consume();
    }
    }//GEN-LAST:event_jTCelularKeyTyped

    private void jTNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNombreKeyTyped
        int key = evt.getKeyChar();//no deja ingresar numeros

    boolean mayusculas = key >= 65 && key <= 90;
    boolean minusculas = key >= 97 && key <= 122;
    boolean espacio = key == 32;
            
     if (!(minusculas || mayusculas || espacio))
    {
        evt.consume();
    }
    }//GEN-LAST:event_jTNombreKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBModifica;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBuscar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLApellido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRAlta;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTCelular;
    private javax.swing.JTextField jTCorreo;
    private javax.swing.JTextField jTDocumento;
    private javax.swing.JTextField jTDomicilio;
    private javax.swing.JTextField jTNombre;
    // End of variables declaration//GEN-END:variables

    public void limpiar() {
        jTDocumento.setText("");
        jTApellido.setText("");
        jTNombre.setText("");
        jTDomicilio.setText("");
        jTCorreo.setText("");
        jTCelular.setText("");
        jRAlta.setSelected(false);
    }
}
///grupo91
