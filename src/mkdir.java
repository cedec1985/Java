import java.io.File;

public class mkdir {
    public static void main (String args [])throws SecurityException{
        String dirname = "C:/Users/édric/OneDrive/Documents/javap1/bin";
        File d = new File(dirname);
        d.mkdir();  
    }
}
