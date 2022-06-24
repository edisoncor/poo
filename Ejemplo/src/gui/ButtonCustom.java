/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author edisoncor
 */
public class ButtonCustom extends JButton{

    public ButtonCustom() {
        setBackground(new java.awt.Color(243, 134, 48));
        setForeground(Color.WHITE);
        setFont(new java.awt.Font("Krungthep", 1, 14));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mouseEntra(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mouseSale(evt);
            }
        });
    }
    
    private void mouseEntra(java.awt.event.MouseEvent evt) {                                      
        setBackground(new Color(250,105,0));
    }                                     

    private void mouseSale(java.awt.event.MouseEvent evt) {                                     
        setBackground(new Color(243,134,48));
    }  
    
    
}
