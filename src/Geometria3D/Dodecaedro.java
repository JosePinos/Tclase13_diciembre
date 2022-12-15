package Geometria3D;


public class Dodecaedro {
    private double area, volumen;

    public Dodecaedro(){
        area = 0.0;
        volumen = 0.0;
    }

    public double areaDodecaedro(double lado){

        double apotema = Math.tan(54.0 * Math.PI / 180.0) * lado / 2.0;
        double supPentagono = 5.0 * lado/2.0 * apotema;
        area = 12 * supPentagono;
        return area;
    }

    public double volumenDodecaedro(double lado){

        volumen = ( (15.0+7*Math.sqrt(5.0))/4.0 ) * Math.pow(lado,3.0);
        return volumen;
    }

    public double sumaAngulosDodecaedro(){
        return 360*(20-2);
    }


}
