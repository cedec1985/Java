import java.io.File;

public class mkdir {
    public static void main (String args []){
        String dirname = "C:/Users/édric/OneDrive/Documents/javap1/creation";
        File d = new File(dirname);
        d.mkdirs();
    }
}
