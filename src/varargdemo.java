    public class VarargsDemo{
    public static void printMax( double...numbers){
           if (numbers.length==0){
               System.out.println("pas d'arguments");
               return;
           }
           double result = numbers[0];
           for (int i =1; i <numbers.length;i++)
               if (numbers[i]>result){
               result = numbers[i];
               System.out.println("la valeur max est" +result);}}
   public static void main (String args[]){
       printMax(34,3,2,56.5);
       printMax(new double[]{1,2,3});}}