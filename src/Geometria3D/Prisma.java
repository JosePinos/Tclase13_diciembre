package Geometria3D;

public class Prisma {

    private double area;
    private double volumen;
    private double diagonal;

    public Prisma() {
        area = 0.0;
        volumen = 0.0;
        diagonal = 0.0;
    }


    public double areaPrismaRect(double largo, double alto, double ancho){
        area = 2.0 * alto * (largo+ancho) +  (2.0 * largo * ancho);
        return  area;
    }

    public double volumenPrismaRect(double largo, double alto, double ancho){
        volumen = largo * alto * ancho;
        return volumen;
    }

    public double diagonalPrismaRect(double largo, double alto, double ancho){
        diagonal = Math.sqrt( Math.pow(largo,2.0) + Math.pow(alto,2.0) + Math.pow(ancho,2.0) );
        return diagonal;
    }

}





















