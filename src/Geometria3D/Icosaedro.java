package Geometria3D;

public class Icosaedro {
    private double area, volumen;

    public Icosaedro(){
        area = 0.0;
        volumen = 0.0;

    }


    public double areaIcosaedro(double lado){

        area = 5.0 * lado * lado * Math.sqrt(3.0);
        return area;
    }

    public double volumenIcosaedro(double lado){
        volumen = 5.0*(3+Math.sqrt(5.0))/12.0 * lado * lado * lado;
        return volumen;
    }



}
