public class This_Example{
    int num =10;
    This_Example(){}
    This_Example(int num){
            this();
    this.num=num;
    }
    public void greet(){
    System.out.println("Hi welcome to tutorial");   
    }
    public void print(){
        int num =20;
        System.out.println("local variable" + num);
        System.out.println("local variable" + this.num);
        this.greet();}
        public static void main (String[] args){
        This_Example obj = new This_Example();
        obj.print();
        This_Example obj2 = new This_Example(30);
        obj2.print();
        }}
    
public class VarargsDemo{
     public static void printMax( double...numbers){
            if (numbers.length==0){
                System.out.println("pas d'arguments");
                return;

            }
            double result = numbers[0];
            for (int i =1; i <numbers.length;i++)
                if (numbers[i]>result)
                result = numbers[i];
                System.out.println("la valeur max est" +result);}
    public static void main (String args[]){
        printMax(34,3,2,56.5);
        printMax(new double[]{1,2,3});}
       
}

    
