package package1;
public class InsufficientRessourcesException extends Exception {
    private double amount;
    public InsufficientRessourcesException(double amount){
        this.amount=amount;

    }
    public double getAmount(){
        return amount;
    }
}
