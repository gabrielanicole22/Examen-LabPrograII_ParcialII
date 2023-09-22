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
public class PlayerInfo extends javax.swing.JFrame {

    PSNUsers psnusers;
    Color SELECT_COLOR = new Color(83, 152, 254);
    private Color colorAnterior;

    public PlayerInfo(PSNUsers psnusers) {
        initComponents();
        this.psnusers = psnusers;

        colorAnterior = btnMostrar.getForeground();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnMostrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario:");

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostrar");
        btnMostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMostrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMostrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMostrarMouseExited(evt);
            }
        });
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        jLabel2.setText("Player Information");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMostrar)
                .addGap(82, 82, 82))
            .addGroup(layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrar))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnMostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarMouseClicked

    }//GEN-LAST:event_btnMostrarMouseClicked

    private void btnMostrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarMouseEntered
        // TODO add your handling code here:
        btnMostrar.setForeground(SELECT_COLOR);
        setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_btnMostrarMouseEntered

    private void btnMostrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMostrarMouseExited
        // TODO add your handling code here:
        btnMostrar.setForeground(colorAnterior);
        setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_btnMostrarMouseExited

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        try {
            psnusers.playerInfo(txtUsuario.getText());
        } catch (IOException ex) {
            Logger.getLogger(PlayerInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
