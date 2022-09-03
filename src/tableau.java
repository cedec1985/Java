import java.util.Random;

public class tableau {
    int [] tab;
    tableau(int n){
        Random rand = new Random();
        tab = new int [n];
        int i =0;
        do
        tab [i++] = rand.nextInt();
        while (i<n);}
        public static void main (String [] args){}
        
        boolean rechercher (int x){
            int i =0;
            do
            if (tab[i++]==x)
            return true;
            while(i<tab.length);
            return false;}}
            
        
