import javax.naming.InsufficientResourcesException;

public class myexception {
    private double balance;
    private int number;
    public  myexception (int number){
        this.number=number;
}
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount) throws InsufficientFundsException{
        if (amount<= balance){
            balance -= amount;
        }
        else{
            double needs= amount - balance;
            throw new InsufficientFundsException(needs);
        }
    }
    public double getBalance(){
        return balance;
    }

    public inr getNumber(){
        return number;
    }

    public static void main(String []args){
        myexception c = new myexception(101);
        System.out.println("depositing $500.....");
        c.deposit(500.00);
        try{
            System.out.println("\nwithdrawing $100....");
            c.withdraw(100.00);
            System.out.println("\nwithdrawing $600....");
            c.withdraw(600.00);
        }catch (InsufficientFundsException e){
            System.out.println("sorry but you are short $ "+ e.getAmount());
            e.printStackTrace();
        }
    }   

}
