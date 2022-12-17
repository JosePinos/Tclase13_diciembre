package Geometria2D;
public class Circulo {
    double area, perimetro, diametro;
    public Circulo(){
        area=0;
        perimetro=0;
        diametro=0;
    }
    private double Area_Circulo(double rad){
        return Math.PI*Math.pow(rad,2);
    }

    private double Perimetro_Circulo(double rad){
        return 2*Math.PI*rad;
    }
    private double Diametro_Circulo(double rad){
        return 2*(rad);
    }

    public double getArea(double rad) {
        return area=Area_Circulo(rad);
    }
    public double getPerimetro(double rad) {
        return perimetro=Perimetro_Circulo(rad);
    }
    public double getDiametro(double rad) {
        return diametro=Diametro_Circulo(rad);
    }
}
