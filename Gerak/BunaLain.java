
package Gerak;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;


    import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BunaLain extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Membuat kelopak bunga
        g.setColor(new Color(255, 140, 0)); // Jingga tua
        g.fillOval(100, 100, 100, 50);
        g.fillOval(150, 125, 100, 50);
        g.fillOval(100, 150, 100, 50);
        g.fillOval(50, 125, 100, 50);

        // Membuat bunga
        g.setColor(new Color(255, 0, 255)); // Magenta
        g.fillOval(125, 125, 50, 50);
        
        // Membuat daun
        g.setColor(new Color(0, 128, 0)); // Hijau tua
        g.fillOval(50, 175, 75, 25);
        g.fillOval(175, 175, 75, 25);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bunga Lain");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new BunaLain());
        frame.setSize(300, 250);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
}
