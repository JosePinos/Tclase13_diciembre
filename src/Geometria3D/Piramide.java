package Geometria3D;

public class Piramide {

    private double area;
    private  double volumen;

    public Piramide(){
        area = 0.0;
        volumen = 0.0;
    }

    public double getArea(double lado, double altura) {
        return areaPiramideCuadrangular(lado, altura);
    }

    public double getVolumen(double lado, double altura) {
        return volumenPiramideCuadrangular(lado, altura);
    }

    public double dameApotema(double lado, double altura){
        return apotemaPiramideCuadrangular(lado, altura);
    }

    private double areaPiramideCuadrangular(double lado, double altura){
            //  apotema     AREA LATERAL + AREA BASE
        area = (  Math.sqrt(Math.pow(altura,2.0) + Math.pow(lado/2.0,2.0)) * 4.0 * lado)/2.0 + Math.pow(lado,2.0) ;
        return area;
    }

    private double volumenPiramideCuadrangular(double lado, double altura){
        volumen = Math.pow(lado,2) * altura /3.0;
        return volumen;
    }

    private  double apotemaPiramideCuadrangular(double lado, double altura){
        return Math.sqrt( Math.pow( lado/2.0, 2.0 ) + Math.pow(altura,2.0) );
    }


}
