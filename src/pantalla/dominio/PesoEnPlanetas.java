package pantalla.dominio;

public class PesoEnPlanetas {
    public static final double GRAVEDAD_TIERRA = 9.81;
    public static final double GRAVEDAD_MARTE = 3.721;
    public static final double GRAVEDAD_MERCURIO = 3.7;
    public static final double GRAVEDAD_VENUS = 8.87;

    public static double calcularPesoEnMarte(double pesoEnTierra) {
        return (pesoEnTierra / GRAVEDAD_TIERRA) * GRAVEDAD_MARTE;
    }

    public static double calcularPesoEnMercurio(double pesoEnTierra) {
        return (pesoEnTierra / GRAVEDAD_TIERRA) * GRAVEDAD_MERCURIO;
    }

    public static double calcularPesoEnVenus(double pesoEnTierra) {
        return (pesoEnTierra / GRAVEDAD_TIERRA) * GRAVEDAD_VENUS;
    }

    public static double calcularPesoEnTierra(double pesoEnTierra) {
        return pesoEnTierra;
    }
}
