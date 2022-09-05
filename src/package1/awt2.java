package package1;

    public class awt2 extends KeyAdapter{

        public void KeyPressed(KeyEvent e){
            if(e.getKeyChar()=='q')
            System.exit(0);
        }
    }
    
