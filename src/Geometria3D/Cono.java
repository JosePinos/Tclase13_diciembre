package Geometria3D;


public class Cono {

    private double area;
    private double volumen;

    public Cono() {
        area = 0.0;
        volumen = 0.0;
    }


    public double areaCono(double radio, double generatriz){

        area = Math.PI * radio * (generatriz + radio) ;
        return area;

    }


    public double volumenCono(double radio, double altura){

        volumen = Math.PI * radio * radio * altura / 3.0;
        return volumen;

    }















}




