/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examen.labprograii_2parcial;

import java.awt.Color;
import java.awt.Cursor;

/**
 *
 * @author Gabriela Mejia
 */
public class Main extends javax.swing.JFrame {

    PSNUsers psnusers;
    Color SELECT_COLOR = new Color(83, 152, 254);
    private Color colorAnterior;

    public Main() {
        initComponents();
        this.psnusers = new PSNUsers();
        colorAnterior = btnAddUser.getForeground();
        Color backgroundColor = new Color(254, 251, 243);
        getContentPane().setBackground(backgroundColor);        
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddUser = new javax.swing.JLabel();
        btnDesactivateUser = new javax.swing.JLabel();
        btnAddTrophieTo = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        btnPlayerInfo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAddUser.setFont(new java.awt.Font("Source Code Pro Light", 1, 18)); // NOI18N
        btnAddUser.setText("Add user");
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

        btnDesactivateUser.setFont(new java.awt.Font("Source Code Pro Light", 1, 18)); // NOI18N
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

        btnAddTrophieTo.setFont(new java.awt.Font("Source Code Pro Light", 1, 18)); // NOI18N
        btnAddTrophieTo.setText("AddTrophieTo");
        btnAddTrophieTo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddTrophieToMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddTrophieToMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddTrophieToMouseExited(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Source Code Pro Light", 1, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });

        btnPlayerInfo.setFont(new java.awt.Font("Source Code Pro Light", 1, 18)); // NOI18N
        btnPlayerInfo.setText("Player Info");
        btnPlayerInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPlayerInfoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPlayerInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPlayerInfoMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Quiska", 0, 36)); // NOI18N
        jLabel1.setText("Examen Laboratorio de Progra II");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPlayerInfo)
                    .addComponent(btnAddTrophieTo)
                    .addComponent(btnDesactivateUser)
                    .addComponent(btnAddUser))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(btnSalir))
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnAddUser)
                .addGap(26, 26, 26)
                .addComponent(btnDesactivateUser)
                .addGap(30, 30, 30)
                .addComponent(btnAddTrophieTo)
                .addGap(29, 29, 29)
                .addComponent(btnPlayerInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddUserMouseClicked
        // TODO add your handling code here:
        new AddUser(psnusers).setVisible(true);
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

    private void btnDesactivateUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDesactivateUserMouseClicked
        // TODO add your handling code here:
        new DesactivateUser(psnusers).setVisible(true);
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

    private void btnAddTrophieToMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddTrophieToMouseClicked
        // TODO add your handling code here:
        new AddTrophieTo(psnusers).setVisible(true);
    }//GEN-LAST:event_btnAddTrophieToMouseClicked

    private void btnAddTrophieToMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddTrophieToMouseEntered
        // TODO add your handling code here:
        btnAddTrophieTo.setForeground(SELECT_COLOR);
        setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_btnAddTrophieToMouseEntered

    private void btnAddTrophieToMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddTrophieToMouseExited
        // TODO add your handling code here:
        btnAddTrophieTo.setForeground(colorAnterior);
        setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_btnAddTrophieToMouseExited

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        // TODO add your handling code here:
        btnSalir.setForeground(SELECT_COLOR);
        setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        // TODO add your handling code here:
        btnSalir.setForeground(colorAnterior);
        setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnPlayerInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayerInfoMouseClicked
        // TODO add your handling code here:
        new PlayerInfo(psnusers).setVisible(true);
    }//GEN-LAST:event_btnPlayerInfoMouseClicked

    private void btnPlayerInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayerInfoMouseEntered
        // TODO add your handling code here:
        btnPlayerInfo.setForeground(SELECT_COLOR);
        setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_btnPlayerInfoMouseEntered

    private void btnPlayerInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayerInfoMouseExited
        // TODO add your handling code here:
        btnPlayerInfo.setForeground(colorAnterior);
        setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_btnPlayerInfoMouseExited

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAddTrophieTo;
    private javax.swing.JLabel btnAddUser;
    private javax.swing.JLabel btnDesactivateUser;
    private javax.swing.JLabel btnPlayerInfo;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
