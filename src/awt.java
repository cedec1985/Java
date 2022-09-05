import java.awt.Graphics;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.applet.*;


   public class awt extends Applet implements AncestorListener {

    static final int LARGEUR=300;
    static final int HAUTEUR=200;
  
    public awt(){
        System.out.println("Bonjour");
        setSize(LARGEUR,HAUTEUR);
        setVisible(true);}

        public void paint(Graphics g){
        g.drawString("Bonjour à tous", 110, 110);
    }

        @Override
        public void ancestorAdded(AncestorEvent event) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void ancestorRemoved(AncestorEvent event) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void ancestorMoved(AncestorEvent event) {
            // TODO Auto-generated method stub
            
        }
    
       public static void main(String []args){}}

