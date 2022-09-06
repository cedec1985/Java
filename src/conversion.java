
public class conversion {
    static final double TAUX_DE_CONVERSION = 6.55957;

    public static double convertirEnEuros (double francs){
    return francs/TAUX_DE_CONVERSION;
    }
    public static double convertirEnFrancs (double euros){
    return euros*TAUX_DE_CONVERSION;
    }
}

