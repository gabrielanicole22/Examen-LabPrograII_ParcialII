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
public class DesactivateUser extends javax.swing.JFrame {

    PSNUsers psnusers;
    Color SELECT_COLOR = new Color(83, 152, 254);
    private Color colorAnterior;

    public DesactivateUser(PSNUsers psnusers) {
        initComponents();
        this.psnusers = psnusers;
        colorAnterior = btnDesactivateUser.getForeground();
        Color backgroundColor = new Color(254, 251, 243);
        getContentPane().setBackground(backgroundColor);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnDesactivateUser = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario:");

        btnDesactivateUser.setText("Desactivate User");
        btnDesactivateUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDesactivateUserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDesactivateUserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDesactivateUserMouseExited(evt);
            }
        });

        jLabel2.setText("Desactivar Usuario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel1)
                        .addGap(36, 36, 36)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(btnDesactivateUser))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel2)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(btnDesactivateUser)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDesactivateUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDesactivateUserMouseClicked
        try {
            psnusers.desactivateUser(txtUsuario.getText());
        } catch (IOException ex) {
            Logger.getLogger(DesactivateUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDesactivateUserMouseClicked

    private void btnDesactivateUserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDesactivateUserMouseEntered
        // TODO add your handling code here:
        btnDesactivateUser.setForeground(SELECT_COLOR);
        setCursor(Cursor.HAND_CURSOR);

    }//GEN-LAST:event_btnDesactivateUserMouseEntered

    private void btnDesactivateUserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDesactivateUserMouseExited
        // TODO add your handling code here:
        btnDesactivateUser.setForeground(colorAnterior);
        setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_btnDesactivateUserMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnDesactivateUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
