package Geometria2D;
public class Triangulo {
    double area, perimetro, hipotenusa;

    public Triangulo(){
        area=0;
        perimetro=0;
        hipotenusa=0;
    }
    private double Area_Triangulo(double bas, double alt){
        return (bas*alt)/2;
    }

    private double Perimetro_Triangulo(double lad, double lad2, double lad3){
        return lad+lad2+lad3;
    }
    private double Hipotenusa_Triangulo(double cat1, double cat2){
        return Math.sqrt(Math.pow(cat1,2)+Math.pow(cat2,2));
    }
    public double getArea(double bas, double alt) {
        return area=Area_Triangulo(bas, alt);
    }
    public double getPerimetro(double lad1, double lad2, double lad3) {
        return perimetro=Perimetro_Triangulo(lad1, lad2,lad3);
    }
    public double getHipotenusa(double cat1, double cat2) {
        return hipotenusa=Hipotenusa_Triangulo(cat1, cat2);
    }
}