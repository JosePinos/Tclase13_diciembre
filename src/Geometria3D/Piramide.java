package Geometria3D;

public class Piramide {

    private double area;
    private  double volumen;

    public Piramide(){
        area = 0.0;
        volumen = 0.0;
    }


    public double areaPiramideCuadrangular(double lado, double altura){
            //  apotema     AREA LATERAL + AREA BASE
        area = (  Math.sqrt(Math.pow(altura,2.0) + Math.pow(lado/2.0,2.0)) * 4.0 * lado)/2.0 + Math.pow(lado,2.0) ;
        return area;

    }

    public double volumenPiramideCuadrangular(double lado, double altura){

        volumen = Math.pow(lado,2) * altura /3.0;
        return volumen;
    }



}
