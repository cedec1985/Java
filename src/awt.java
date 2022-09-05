import java.awt.Frame;
import java.awt.Graphics;

public class awt extends Frame {
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
        

