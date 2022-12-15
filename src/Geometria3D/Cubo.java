package Geometria3D;

public class Cubo {

    private double area, volumen;

    public Cubo(){
        area = 0.0;
        volumen = 0.0;
    }


    public double areaCubo(double lado){

        area = 6.0 * lado * lado;
        return area;

    }

    public double volumenCubo(double lado){

        volumen = Math.pow(lado, 3.0);
        return volumen;

    }








}
