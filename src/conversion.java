
public class conversion {
    static final double taux_de_conversion = 6.55957;

    public static double convertirEnEuros (double francs){
    return francs/taux_de_conversion;
    }
    public static double convertirEnFrancs (double euros){
    return euros*taux_de_conversion;
    }
}

