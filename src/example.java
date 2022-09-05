
public class example{
    int num =10;
    example(){}
    example(int num){
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
        example obj = new example();
        obj.print();
        example obj2 = new example(30);
        obj2.print();
        }}
    

    
