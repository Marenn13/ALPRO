/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gerak;
 import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;




  
public class Bunga2 extends JPanel {
    
    private Color kelopakColor;
    private Color bungaColor;

    public Bunga2(Color kelopakColor, Color bungaColor) {
        this.kelopakColor = kelopakColor;
        this.bungaColor = bungaColor;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Membuat kelopak bunga
        g.setColor(kelopakColor);
        g.fillOval(100, 100, 100, 50);
        g.fillOval(150, 125, 100, 50);
        g.fillOval(100, 150, 100, 50);
        g.fillOval(50, 125, 100, 50);

        // Membuat bunga
        g.setColor(bungaColor);
        g.fillOval(125, 125, 50, 50);
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Bunga");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Bunga2(Color.GREEN, Color.PINK));
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
}
