import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

class fichier {
   private String nomFichier;
   fichier(String nom,int n) throws IOException{
    nomFichier = nom;
    Random rand = new Random();
    DataOutputStream f = new DataOutputStream(new FileOutputStream(nomFichier));
    for (int i=0;i<n;i++)
    f.writeInt(rand.nextInt());
    f.close();
   }
   public double moyenne() throws IOException
   {
    DataInputStream f = new DataInputStream(new FileInputStream(nomFichier));
    int nbelmnt = 0; int moyenne =0;
    try{
        while (true){
            moyenne +=f.readInt();
            nbelmnt++;
        }
    }
    catch (EOFException e){
        f.close();
    }
    return nbelmnt ==0 ? 0:moyenne/(double) nbelmnt;
}
}








