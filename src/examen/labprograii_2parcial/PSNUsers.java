/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.labprograii_2parcial;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriela Mejía
 */
public class PSNUsers {

    private RandomAccessFile raf;
    private HashTable users;
    public int points;

    public PSNUsers() {
        try {
            raf = new RandomAccessFile("psn", "rw");
            users = new HashTable();
            reloadHashTable();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void reloadHashTable() throws IOException {
        long pos = 0;
        while (pos < raf.length()) {
            String username = raf.readUTF();
            boolean isActive = raf.readBoolean();
            if (isActive) {
                users.add(username, pos);
            }
            pos = raf.getFilePointer();
        }
    }

    public void addUser(String username) throws IOException {
        if (users.search(username) != -1) {
            JOptionPane.showMessageDialog(null, "Error: El usuario ya existe.");
            return;
        }
        long pos = raf.length();
        raf.writeUTF(username);
        raf.writeBoolean(true);
        users.add(username, pos);
        JOptionPane.showMessageDialog(null, "Usuario creado exitosamente.");
    }

    public void desactivateUser(String username) throws IOException {
        long pos = users.search(username);
        if (pos != -1) {
            raf.seek(pos + 4);
            raf.writeBoolean(false);
            users.remove(username);
            JOptionPane.showMessageDialog(null, "Usuario desactivado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
        }
    }

    public void addTrophyTo(String username, String trophyGame, String trophyName, Trophy type) throws IOException {
        long pos = users.search(username);
        if (pos != -1) {
            raf.seek(pos + 4);
            if (raf.readBoolean()) {
                raf.seek(raf.length());
                raf.writeUTF(username);                
                raf.writeUTF(trophyGame);                
                raf.writeUTF(trophyName);
                raf.writeUTF(type.name());
                long fechaCreacion = new Date().getTime();
                raf.writeLong(fechaCreacion);
            }
        }
        JOptionPane.showMessageDialog(null, "Trofeo agregado exitosamente.");
    }

    public void playerInfo(String username) throws IOException {
        long pos = users.search(username);
        if (pos != -1) {
            raf.seek(pos + 4);
            if (raf.readBoolean()) {
                //prints de prueba
                System.out.println("Nombre de usuario: " + username);
                //Falta terminar
                System.out.println("Puntos por trofeos: ");
                System.out.println("Contador de trofeos: ");
                System.out.println("Trofeos: ");

                while (raf.getFilePointer() < raf.length()) {
                    String trophyUsername = raf.readUTF();
                    String trophyType = raf.readUTF();
                    String trophyGame = raf.readUTF();
                    String trophyName = raf.readUTF();
                    String trophyDate = raf.readUTF();
                    System.out.println(trophyDate + " - " + trophyType + " - " + trophyGame + " - " + trophyName);
                }
            }
        }
    }
}