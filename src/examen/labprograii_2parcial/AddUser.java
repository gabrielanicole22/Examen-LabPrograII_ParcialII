/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examen.labprograii_2parcial;

import java.awt.Color;
import java.awt.Cursor;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gabriela Mejia
 */
public class AddUser extends javax.swing.JFrame {

    PSNUsers psnusers;
        Color SELECT_COLOR = new Color(83, 152, 254);
    private Color colorAnterior;
    public AddUser(PSNUsers psnusers) {
        initComponents();
        this.psnusers=psnusers;
                colorAnterior = btnAddUser.getForeground();        
        Color backgroundColor = new Color(254, 251, 243);
        getContentPane().setBackground(backgroundColor);    
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnAddUser = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario:");

        btnAddUser.setText("Add User");
        btnAddUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddUserMouseExited(evt);
            }
        });

        jLabel2.setText("Agregar Usuario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddUser)
                .addGap(178, 178, 178))
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(btnAddUser)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddUserMouseClicked
        try {
            psnusers.addUser(txtUsuario.getText());
        } catch (IOException ex) {
            Logger.getLogger(AddUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddUserMouseClicked

    private void btnAddUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddUserMouseEntered
        // TODO add your handling code here:
        btnAddUser.setForeground(SELECT_COLOR);
        setCursor(Cursor.HAND_CURSOR);        
    }//GEN-LAST:event_btnAddUserMouseEntered

    private void btnAddUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddUserMouseExited
        // TODO add your handling code here:
        btnAddUser.setForeground(colorAnterior);
        setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_btnAddUserMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAddUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
