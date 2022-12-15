package Geometria3D;

public class Esfera {

    private double area, volumen;

    public Esfera(){
        area = 0.0;
        volumen = 0.0;
    }


    public double areaEsfera(double radio){

        area = 4.0 * Math.PI * radio * radio;
        return area;
    }

    public double volumenEsfera(double radio){

        volumen = 4.0 * Math.PI * radio * radio * radio / 3.0;
        return volumen;
    }











}
