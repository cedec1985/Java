import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionListener;
import javafx.event.ActionEvent;


public class Appleteuroconvertisseur extends Applet implements ActionListener {
    TextField monnaie = new TextField("");
    Button euros = new Button("euros");
    Button  exit = new Button("exit");
    Button francs = new Button("francs");


    public Appleteuroconvertisseur() {
        super();
    }

    @Override
    public void init() {
        setLayout(new GridLayout(2, 1));
        monnaie.setBackground(null);
        add(monnaie);
        Panel p = new Panel();
        p.setLayout(new GridLayout(1, 2));
        p.add(euros);
        euros.addActionListener(this);
        p.add(francs);
        francs.addActionListener(this);
        add(p);
        pack();
        setVisible(true);
       
    }
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
    throw new UnsupportedOperationException();}
    

    private void pack() {
        throw new UnsupportedOperationException(); 
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exit)
            System.out.println("un message");

        double valeur = 0;
        try {
            valeur = (Double.parseDouble(monnaie.getText()));
        } catch (NumberFormatException ex) {
            monnaie.setText("Valeur réelle erronnée");
            return;
        }
        if (e.getSource() == euros)
            monnaie.setText(Double.toString(conversion.convertirEnEuros(valeur)));
        else
            monnaie.setText(Double.toString(conversion.convertirEnFrancs(valeur)));

        exit.addActionListener(this);
        euros.addActionListener(this);
        francs.addActionListener(this);
    }}
    class conversion {
        private conversion(){}
       
        static final double TAUX_DE_CONVERSION = 6.55957;
    
        public static double convertirEnEuros (double francs){
        return francs/TAUX_DE_CONVERSION;
        }
        public static double convertirEnFrancs (double euros){
        return euros*TAUX_DE_CONVERSION;
        }
     }
    