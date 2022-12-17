package Geometria2D;
public class Cuadrado {
    double area, perimetro, diagonal;
    public Cuadrado(){
        area=0;
        perimetro=0;
        diagonal=0;
    }
    private double Area_Cuadrado(double lad){
        return Math.pow(lad,2);
    }

    private double Perimetro_Cuadrado(double lad){
        return lad+lad+lad+lad;
    }
    private double Diagonal_Cuadrado(double lad){
        return lad*Math.sqrt(2);
    }

    public double getArea(double lad) {
        return area=Area_Cuadrado(lad);
    }

    public double getPerimetro(double lad) {
        return perimetro=Perimetro_Cuadrado(lad);
    }

    public double getDiagonal(double lad) {
        return diagonal=Diagonal_Cuadrado(lad);
    }
}