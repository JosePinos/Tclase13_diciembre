package Geometria3D;


public class Cono {

    private double area;
    private double volumen;

    public Cono() {
        area = 0.0;
        volumen = 0.0;
    }


    public double getArea(double radio, double generatriz) {
        return areaCono(radio, generatriz);
    }

    public double getVolumen(double radio, double altura) {
        return volumenCono(radio, altura);
    }

    public double dameGeneratriz(double radio, double altura){
        return  generatrizCono(radio, altura);
    }



    private double areaCono(double radio, double generatriz){
        area = Math.PI * radio * (generatriz + radio) ;
        return area;
    }


    private double volumenCono(double radio, double altura){
        volumen = Math.PI * radio * radio * altura / 3.0;
        return volumen;
    }


    private double generatrizCono(double radio, double altura){
        return Math.sqrt( Math.pow(radio,2) + Math.pow(altura,2) );
    }












}




