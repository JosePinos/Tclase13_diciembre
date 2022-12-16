package Geometria3D;

public class Esfera {

    private double area, volumen;

    public Esfera(){
        area = 0.0;
        volumen = 0.0;
    }


    public double getArea(double radio) {
        return areaEsfera(radio);
    }

    public double getVolumen(double radio) {
        return volumenEsfera(radio);
    }

    private double areaEsfera(double radio){

        area = 4.0 * Math.PI * radio * radio;
        return area;
    }

    private double volumenEsfera(double radio){

        volumen = 4.0 * Math.PI * radio * radio * radio / 3.0;
        return volumen;
    }











}
