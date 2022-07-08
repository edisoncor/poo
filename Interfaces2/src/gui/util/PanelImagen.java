/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui.util;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author edisoncor
 */
public class PanelImagen extends javax.swing.JPanel {

    private Image image=null;
    private Icon icon;
    
    /**
     * Creates new form PanelImagen
     */
    public PanelImagen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 447, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
     public void setImage(String fileName){
        setIcon(new ImageIcon(getClass().getResource(fileName))); 
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon){
        this.icon=icon;
        if(icon!=null)
            image=((ImageIcon)icon).getImage();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 =(Graphics2D) g;
        if(image!=null)
            g2.drawImage(image, 0, 0, getWidth(), getHeight(), null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}