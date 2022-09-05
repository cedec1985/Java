package package1;
import java.awt.*;
import java.awt.event.KeyListener;
import javafx.scene.input.KeyEvent;


public class awt extends Frame {
    static final int LARGEUR=300;
    static final int HAUTEUR=200;
    public awt(){
        super("Bonjour");
        setSize(LARGEUR,HAUTEUR);
        setVisible(true);
        addKeyListener(new awt2());
       
    }
    public void paint(Graphics g){
        g.drawString("Bonjour à tous", 110, 110);
    }
}



