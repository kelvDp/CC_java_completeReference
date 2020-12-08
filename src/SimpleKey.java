import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SimpleKey extends Frame implements KeyListener {

    String msg = "";
    String keyState = "";

    SimpleKey() {
        addKeyListener(this);
        addWindowListener(new MyWindowAdapter());
    }

    @Override
    public void keyTyped(KeyEvent e) {
        msg += e.getKeyChar();
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keyState = "key down";
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keyState = "key up";
        repaint();
    }

    // display keystrokes
    public void paint(Graphics g) {
        g.drawString(msg, 200, 100);
        g.drawString(keyState, 20, 50);
    }

    public static void main(String[] args) {
        SimpleKey appwin = new SimpleKey();

        appwin.setTitle("SimpleKey");
        appwin.setSize(new Dimension(300, 300));
        appwin.setVisible(true);
    }
}
