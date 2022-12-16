package Geometria3D;

public class Cilindro {

    private double area;
    private double volumen;

    public Cilindro() {
        area = 0.0;
        volumen = 0.0;
    }

    public double getArea(double radio, double altura) {
        return areaCilindro(radio, altura);
    }

    public double getVolumen(double radio, double altura) {
        return volumenCilindro(radio, altura);
    }

    private double areaCilindro(double radio, double altura){
        double supLateral = 2.0 * Math.PI * radio * altura;
        double supBase = 2.0 * Math.PI * radio * radio;
        area = supLateral + supBase;
        return area;
    }


    private double volumenCilindro(double radio, double altura){
        volumen = Math.PI * radio * radio *altura;
        return volumen;
    }





}//FIN DE LA CLASE GEOMETRIA 3D
