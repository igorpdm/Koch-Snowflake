import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class JanelaKoch extends JFrame {

    public JanelaKoch() {
        initGUI();
    }

    private void initGUI() {
        this.setTitle("Floco de Neve de Koch");
        setSize(1000, 1000);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DesenhoCanvas dc = new DesenhoCanvas();
        add(dc);

        setVisible(true);
    }

    class DesenhoCanvas extends Canvas {

        @Override
        public void paint(Graphics g) {
            super.paint(g);
            int altura = getHeight() - 200;
            int largura = getWidth();

            int x1 = largura / 2;
            int y1 = 100;
            int x2 = largura - 100;
            int y2 = altura - 100;
            int x3 = 100;
            int y3 = altura - 100;

            desenhaFlocoKoch(g, 4, x1, y1, x2, y2);
            desenhaFlocoKoch(g, 4, x2, y2, x3, y3);
            desenhaFlocoKoch(g, 4, x3, y3, x1, y1);
        }

        private void desenhaFlocoKoch(Graphics g, int nivel, int x1, int y1, int x2, int y2) {
            if (nivel == 0) {
                g.drawLine(x1, y1, x2, y2);
            } else {
                int deltaX = x2 - x1;
                int deltaY = y2 - y1;

                int xA = x1 + deltaX / 3;
                int yA = y1 + deltaY / 3;

                int xC = x2 - deltaX / 3;
                int yC = y2 - deltaY / 3;

                int xB = (int) (xA + Math.cos(Math.PI / 3) * (xC - xA) + Math.sin(Math.PI / 3) * (yC - yA));
                int yB = (int) (yA + Math.cos(Math.PI / 3) * (yC - yA) - Math.sin(Math.PI / 3) * (xC - xA));

                desenhaFlocoKoch(g, nivel - 1, x1, y1, xA, yA);
                desenhaFlocoKoch(g, nivel - 1, xA, yA, xB, yB);
                desenhaFlocoKoch(g, nivel - 1, xB, yB, xC, yC);
                desenhaFlocoKoch(g, nivel - 1, xC, yC, x2, y2);
            }
        }
    }
    public static void main(String[] args) {
        JanelaKoch j = new JanelaKoch();
    }
}
