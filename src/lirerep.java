import java.io.File;

public class lirerep {
    public static void main(String args[]){
        File file = null;
        String[] paths;
        try{
            file = new File("C:/Users/Cédric/OneDrive/Documents/javap1/");
            paths = file.list();
            for (String path:paths){
                System.out.println(path);

            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
