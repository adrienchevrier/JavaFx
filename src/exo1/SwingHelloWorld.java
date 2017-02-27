/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo1;

import javax.swing.JFrame;

/**
 *
 * @author Nicolas
 */
public class SwingHelloWorld extends JFrame {
    
    public SwingHelloWorld(){
        
        setSize(800,600);
        setVisible(true);
    }
    
    public static void main (String[] args) {
        
        SwingHelloWorld shw = new SwingHelloWorld();
    }
    
}
