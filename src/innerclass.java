class innerclass {
    int num;
private class innerdemo{
    public void print(){
        System.out.println("this is a inner class");
    }
}
void displayinner(){
    innerdemo demo= new innerdemo();
    demo.print();
}}
 class maclasse{
    public static void main(String[] args){
        innerclass inner = new innerclass();
        inner.displayinner();
    }
}

