import java.applet.*;
import java.awt.*;

public class AppletAnimation extends Applet implements Runnable {
   Thread thread;
   protected Image tabImage[];
   protected int index;

   public void init() {
      super.init();
      // chargement du tableau d'images
      index = 0;
      tabImage = new Image[2];
      for (int i = 0; i < tabImage.length; i++) {
         String fichier = new String("monimage" + (i + 1) + ".gif ");
         tabImage[i] = getImage(getDocumentBase(), fichier);
      }
   }

   public void paint(Graphics g) {
      super.paint(g);
      // affichage de l'image
      g.drawImage(tabImage[index], 10, 10, this);
   }

   public void run() {
      // traitements exécutés par le thread
      while (true) {
         repaint();
         index++;
         if (index >= tabImage.length)
            index = 0;
         try {
            thread.sleep(500);
      } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
   }

   public void start() {
      // démarrage du thread
      if (thread == null) {
         thread = new Thread(this);
         thread.start();
      }
   }

   public void stop() {
      // arrêt du thread
      if (thread != null) {
         thread.stop();
         thread = null;
      }
   }

   public void update(Graphics g) {
      // la redéfinition de la méthode permet d'éviter les scintillements
      paint(g);
   }

}
