import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {

    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).

        Color[] colors = new Color[]{Color.red, Color.orange, Color.yellow, Color.green, Color.blue,
                new Color(103, 41, 140), new Color(230, 130, 238)};

        int size = 320;
        for (int i = 0; i < colors.length; i++) {
            rainbowsquare(size, colors[i], graphics);
            size -= 50;
        }
    }

    public static void rainbowsquare(int mysize, Color myColor, Graphics graphics) {
        graphics.setColor(myColor);
        graphics.fillRect(160 - mysize / 2, 160 - mysize / 2, mysize, mysize);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}