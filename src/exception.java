
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class exception {

public static void main(String[] args){
    FileReader fr=null;
    try{
        File file = new File ("file.txt");
        fr = new FileReader(file); 
        char [] a = new char[50];
        fr.read(a);
        for (char c:a);}
    catch (IOException e){
        e.printStackTrace();}
        finally{
            try{
                File file1 = new File ("file.txt");
                fr =new FileReader(file1);
                char [] b = new char [50];
                fr.read(b);
                fr.close();
            }
        catch(IOException ex){
            ex.printStackTrace();
        }}
    } 
}

