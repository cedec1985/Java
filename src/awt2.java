import java.awt.event.*;

    public class awt2 extends KeyAdapter{

        public void KeyPressed(KeyEvent e){
            if(e.getKeyChar()=='q')
            System.exit(0);
        }
    }
    

