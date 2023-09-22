/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.labprograii_2parcial;

/**
 *
 * @author Gabriela Mejía
 */
public class Entry {
    //Atributos
    String username;
    long position;
    Entry next;

    public Entry(String username, long position) {
        this.username = username;
        this.position = position;
        this.next = null;
    }
}