import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class fichier {
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

private void recopier (DataInputStream i, DataOutputStream o)
{
try{
    while(true) o.writeInt(i.readInt());
}
catch (EOFException e) {
    i.close();
    o.close();
}

public void fusionner (String f1, String f2){
throw  IOException, EOFException{
    DataInputStream f = new DataInputStream(new FileInputStream(f1));
    DataInputStream g = new DataInputStream(new FileInputStream(f2));
    DataOutputStream h = new DataOutputStream(new FileOutputStream(nomFichier));
    int x;
    int y;
    try{
        x=f.readInt();
    }
    catch (EOFException e ){
        recopier(g,h);
        return;
    }
    try{
        y=g.readInt();
    }
        catch(EOFException e) {
            h.writeInt(x);
            recopier(f,h);
            return;
        }
        while(true)
        if (x<=y){
            h.writeInt(x);
            try{
                x=f.readInt();}
                catch(EOFException e){
                    h.writeInt(y);
                    recopier(g,h);
                    return;
                }
            }
            else{
                h.writeInt(y);
            try{
                y=g.readInt();
            }
            catch(EOFException e){
                h.writeInt(x);
                recopier(f,h);
                return;
            }}}}}








