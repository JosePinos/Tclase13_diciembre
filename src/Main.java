import Geometria3D.*;
import Geometria2D.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!\n");

        System.out.println("\t\tCUERPOS GEOMÉTRICOS");

        Cilindro myCil = new Cilindro();
        System.out.println("El área de un cilindro de radio: "+5
               +" y altura: "+ 10 +", es: " + myCil.getArea(5,10) );

        Tetraedro myTetra = new Tetraedro();
        System.out.println("El área de un tetraedro de lado: " + 10 + " es: "+
                myTetra.getArea(10));

        Prisma myPrisma = new Prisma();
        System.out.println("El área de un prisma de largo: " + 7.48 +
                ", alto: " + 23.4 + " y ancho: " + 9.012 +
                " es: " + myPrisma.getArea(7.48, 23.4, 9.012));

        System.out.println("La diagonal de un prisma de largo: " + 7.48 +
                ", alto: " + 23.4 + " y ancho: " + 9.012 +
                " es: " + myPrisma.getDiagonal(7.48, 23.4, 9.012));






        System.out.println("\n\n\t\tFIGURAS GEOMÉTRICAS");

        Hexagono miHexa = new Hexagono();
        System.out.println("El área de un hexágono de lado: " + 10 +
                " es: " +miHexa.getArea(10));


        Octagono miOct = new Octagono();
        double perimOct = miOct.getPerimetro(34.7);
        double apotOct = miOct.getApotema(34.7);
        System.out.println("El perímetro de un octágono de lado: "+
                34.7 + " es: " + perimOct + " y con una apotema de " +
                apotOct + " se tiene un área de " + miOct.getArea(perimOct, apotOct));


        Triangulo miTrian = new Triangulo();
        System.out.println("La hipotenusa de un triángulo de cat1: " + 8.45 +
                " y cat: " + 4.78 + ", es: " + miTrian.getHipotenusa(8.45, 4.78));

        System.out.println("El área de un triángulo de base: " + 3.45 +
                " y altura: " + 9.1 + ", es: " + miTrian.getArea(3.45, 9.1));


    }//fin del método de main
}