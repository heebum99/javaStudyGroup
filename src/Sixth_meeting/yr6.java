package Sixth_meeting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class yr6 extends JFrame implements MouseListener {
    static int count = 0;
    static int diameter = 10;

    public yr6() {
        addMouseListener(this);
        setSize(600, 600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        yr6 f = new yr6();
    }

    public void mouseClicked(MouseEvent e) {
        Graphics g = getGraphics();
        if (count % 3 == 0) {
            g.setColor(Color.ORANGE);
            count++;
        } else if (count % 3 == 1) {
            g.setColor(Color.BLUE);
            count++;
        } else {
            g.setColor(Color.RED);
            count++;
        }
        g.fillOval(e.getX() - 30, e.getY() - 30, diameter, diameter);
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
        diameter += 10;
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }
}
