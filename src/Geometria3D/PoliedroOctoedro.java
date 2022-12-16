package Geometria3D;

public class PoliedroOctoedro {

    private double area, volumen, diagonal;

    public PoliedroOctoedro(){
        area = 0.0;
        volumen = 0.0;
    }


    public double getArea(double lado) {
        return areaOctoedro(lado);
    }

    public double getVolumen(double lado) {
        return volumenOctoedro(lado);
    }

    public double getDiagonal(double lado) {
        return diagonalOctoedro(lado);
    }

    public double areaOctoedro(double lado){

        area = 2.0 * lado * lado * Math.sqrt(3.0);
        return area;
    }

    public double volumenOctoedro(double lado){

        volumen = lado * lado * lado * Math.sqrt(2.0)/3.0;
        return volumen;
    }


    public double diagonalOctoedro(double lado){

        diagonal = Math.sqrt(2.0) * lado;
        return diagonal;
    }


}
