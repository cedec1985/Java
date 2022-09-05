import java.awt.Frame;
import java.awt.Graphics;

import javax.swing.event.AncestorListener;
import javax.*;
import java.applet.*;

public class Appletawt extends Applet implements AncestorListener {}

public class awt extends Frame{
    static final int LARGEUR=300;
    static final int HAUTEUR=200;
    public awt(){
        super("Bonjour");
        setSize(LARGEUR,HAUTEUR);
        setVisible(true);
       
    }
   public static void main(String []args){}
        public void paint(Graphics g){
        g.drawString("Bonjour à tous", 110, 110);
    }}
 
     

