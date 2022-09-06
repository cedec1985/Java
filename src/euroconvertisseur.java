import java.awt.*;
import java.awt.event.ActionListener;
import javafx.event.ActionEvent;


    public class euroconvertisseur extends Frame{
    TextField monnaie =new TextField("");
    Button euros = new Button("euros"),
            exit = new Button("exit");
    Button francs = new Button("francs");



private void setLayout(GridLayout gridLayout) {
}

private void add(Panel p) {
}        
public euroconvertisseur(){
    super();
    setLayout(new GridLayout(2,1));
    monnaie.setBackground(null);
   
    Panel p = new Panel();
    p.setLayout(new FlowLayout() );
    p.add(exit);
    p.add(euros);
    p.add(francs); 
    p.add(monnaie);
    add(p);
    pack();
    setVisible(true);
    
}

private void pack() {
}

private void setVisible(boolean b) {
}

public void actionPerformed(ActionEvent e){
    if(e.getSource()==exit) System.out.println(0);
    double valeur=0;
    try{
        valeur=(Double.parseDouble(monnaie.getText()));}
        catch (NumberFormatException ex){
            monnaie.setText("Valeur réelle erronnée");
            return;
        }
        if(e.getSource()==euros)
        monnaie.setText(Double.toString(conversion.convertirEnEuros(valeur)));
        else
        monnaie.setText(Double.toString(conversion.convertirEnFrancs(valeur)));
    
exit.addActionListener((ActionListener) this);
euros.addActionListener((ActionListener) this);
francs.addActionListener((ActionListener) this);
}
public static void main(String[] args) {
}}