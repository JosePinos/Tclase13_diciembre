package Geometria3D;

public class Tetraedro {
    private double area, volumen, altura;

    public Tetraedro(){
        area = 0.0;
        volumen = 0.0;
    }

    public double areaTetraedro(double lado){
        area = lado * lado * Math.sqrt(3.0);
        return area;
    }


    public double alturaTetraedro(double lado){
        altura = lado * Math.sqrt(6.0) / 3.0;
        return altura;
    }

    public double volumenTetraedro(double lado){
        volumen = Math.pow(lado, 3.0) * Math.sqrt(2.0) / 12.0;
        return volumen;
    }


}
