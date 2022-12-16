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


    public double getArea(double largo, double alto, double ancho) {
        return areaPrismaRect(largo, alto, ancho);
    }

    public double getVolumen(double largo, double alto, double ancho) {
        return volumenPrismaRect(largo, alto, ancho);
    }

    public double getDiagonal(double largo, double alto, double ancho) {
        return diagonalPrismaRect(largo, alto, ancho);
    }

    private double areaPrismaRect(double largo, double alto, double ancho){
        area = 2.0 * alto * (largo+ancho) +  (2.0 * largo * ancho);
        return  area;
    }

    private double volumenPrismaRect(double largo, double alto, double ancho){
        volumen = largo * alto * ancho;
        return volumen;
    }

    private double diagonalPrismaRect(double largo, double alto, double ancho){
        diagonal = Math.sqrt( Math.pow(largo,2.0) + Math.pow(alto,2.0) + Math.pow(ancho,2.0) );
        return diagonal;
    }

}





















