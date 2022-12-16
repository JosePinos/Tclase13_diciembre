package Geometria3D;

public class Cubo {

    private double area, volumen;

    public Cubo(){
        area = 0.0;
        volumen = 0.0;
    }


    public double getArea(double lado) {
        return areaCubo(lado);
    }

    public double getVolumen(double lado) {
        return volumenCubo(lado);
    }

    public double dameDiagonal(double lado){
        return diagonalCubo(lado);
    }

    private double areaCubo(double lado){
        area = 6.0 * lado * lado;
        return area;
    }

    private double volumenCubo(double lado){
        volumen = Math.pow(lado, 3.0);
        return volumen;
    }

    private double diagonalCubo(double lado){
        return Math.cbrt(3) * lado;
    }






}
