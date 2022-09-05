import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.*;

public class awt extends Frame{
    static final int LARGEUR=300;
    static final int HAUTEUR=200;
    public awt(){
        super("Bonjour");
        setSize(LARGEUR,HAUTEUR);
        setVisible(true);
       
    }}
    abstract class awt2 extends KeyAdapter{

        public void KeyPressed(KeyEvent e){
            if(e.getKeyChar()=='q')
            System.exit(0);}


   public static void main(String []args){}
        public void paint(Graphics g){
        g.drawString("Bonjour à tous", 110, 110);
    }}
 
     

