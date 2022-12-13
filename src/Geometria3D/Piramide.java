package Geometria3D;

import java.util.Scanner;

public class Piramide {

    private double area;
    private  double volumen;

    public Piramide(){
        area = 0.0;
        volumen = 0.0;
    }

    public double getArea() {
        return area;
    }

    public double getVolumen() {
        return volumen;
    }

    public void area_volumenPiramide(){
        Scanner sc = new Scanner(System.in);
        double lado, altura;

        System.out.print("Ingrese el lado de la pirámide cuadrangular: ");
        lado = sc.nextDouble();
        while(lado < 0.0){
            System.out.print("Ingrese el lado de la pirámide cuadrangular: ");
            lado = sc.nextDouble();
        }

        System.out.print("\nIngrese la altura de la pirámide cuadrangular: ");
        altura = sc.nextDouble();
        while(altura < 0.0){
            System.out.print("Ingrese el altura de la pirámide cuadrangular: ");
            altura = sc.nextDouble();
        }

            //  apotema     AREA LATERAL + AREA BASE
        area = (  Math.sqrt(Math.pow(altura,2.0) + Math.pow(lado/2.0,2.0)) * 4.0 * lado)/2.0 + Math.pow(lado,2.0) ;

        volumen = Math.pow(lado,2) * altura /3.0;

        System.out.println("\nEl área de la pirámide: " + getArea() +
                "\nEl volúmen de la pirámide es: " + getVolumen());

    }





}
