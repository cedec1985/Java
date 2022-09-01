public class inner2 {
    private int num =175;
    public class innerdemo{
        public int getNum(){
            System.out.println("this is the getnum method of the inner class");
            return num;
        }
    }
}
public class maclasse2{
    public static void main(String args[]){
        inner2 demo = new inner2();
        inner2.innerdemo inner = demo .new innerdemo();
        System.out.println(inner.getNum());
        
    }
}

