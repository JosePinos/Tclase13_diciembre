package Geometria3D;

public class Tetraedro {
    private double area, volumen, altura;

    public Tetraedro(){
        area = 0.0;
        volumen = 0.0;
    }


    public double getArea(double lado) {
        return areaTetraedro(lado);
    }

    public double getVolumen(double lado) {
        return volumenTetraedro(lado);
    }

    public double getAltura(double lado) {
        return alturaTetraedro(lado);
    }



    private double areaTetraedro(double lado){
        area = lado * lado * Math.sqrt(3.0);
        return area;
    }


    private double alturaTetraedro(double lado){
        altura = lado * Math.sqrt(6.0) / 3.0;
        return altura;
    }

    private double volumenTetraedro(double lado){
        volumen = Math.pow(lado, 3.0) * Math.sqrt(2.0) / 12.0;
        return volumen;
    }


}
