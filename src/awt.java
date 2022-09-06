import java.awt.Graphics;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.applet.*;
    
public class awt{
    static final int LARGEUR=300;
    static final int HAUTEUR=200;

      
    public awt(){
        System.out.println("Bonjour");
        setSize(LARGEUR,HAUTEUR);
        setVisible(true);
    }
private void setVisible(boolean b) {
    }
private void setSize(int largeur2, int hauteur2) {
    }  
public void paint(Graphics g){
        g.drawString("Bonjour à tous", 110, 110);}
public static void main(String []args){
 

        public void KeyPressed(KeyEvent e){
            if(e.getKeyChar()=='q')
            System.exit(0);
        }

        class awt extends Applet implements AncestorListener {
                @Override
                public void ancestorAdded(AncestorEvent event) {
                    
                    
                }
        
                @Override
                public void ancestorRemoved(AncestorEvent event) {
                    
                    
                }
        
                @Override
                public void ancestorMoved(AncestorEvent event) {
                    
                }}}
    



