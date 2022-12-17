package Geometria2D;

public class Decagono {
    double apotema, area, perimetro;

    public Decagono() {
        apotema = 0;
        area = 0;
        perimetro = 0;
    }

    private double Area_Decagono(double lad) {
        return 5 * Apotema_Decagono(lad) * lad;
    }

    private double Perimetro_Decagono(double lad) {
        return 10 * lad;
    }

    private double Apotema_Decagono(double lad) {
        return (lad / 2) * (Math.sin(72) / Math.sin(18));
    }

    public double getArea(double lad) {
        return area=Area_Decagono(lad);
    }

    public double getPerimetro(double lad) {
        return perimetro=Perimetro_Decagono(lad);
    }

    public double getApotema(double lad) {
        return apotema=Apotema_Decagono(lad);
    }
}
