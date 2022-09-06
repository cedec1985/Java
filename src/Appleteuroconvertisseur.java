import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionListener;
import javafx.event.ActionEvent;

public class Appleteuroconvertisseur extends Applet implements ActionListener {
    TextField monnaie = new TextField("");
    Button euros = new Button("euros"),
            exit = new Button("exit");
    Button francs = new Button("francs");

    private void setLayout(GridLayout gridLayout) {
    }

    private void add(Panel p) {
    }

    public Appleteuroconvertisseur() {
        super();
    }

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

    private void pack() {
    }

    public static void main(String[] args) {
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exit)
            System.out.println(0);
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

        exit.addActionListener((ActionListener) this);
        euros.addActionListener((ActionListener) this);
        francs.addActionListener((ActionListener) this);
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
    }
}