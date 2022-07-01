/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.util;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author edisoncor
 */
public class ButtonMenu extends JButton{

    public ButtonMenu() {
        setBackground(new java.awt.Color(0, 126, 128));
        setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        setForeground(new java.awt.Color(255, 255, 255));
        setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons/005.png"))); // NOI18N
        setText("jButton1");
        setBorderPainted(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });

    }
    
    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        setBackground(new Color(251,105,0));
    }                                     

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {                                     
        setBackground(new Color(0,126,128));
    }  
    
    
    
}
