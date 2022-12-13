package Geometria3D;

import java.util.Scanner;

public class Esfera {

    private double area, volumen;

    public Esfera(){
        area = 0.0;
        volumen = 0.0;
    }

    public double getArea() {
        return area;
    }

    public double getVolumen() {
        return volumen;
    }



    public void area_volumenEsfera(){
        double radio;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el radio de la esfera: ");
        radio = sc.nextDouble();

        area = 4.0 * Math.PI * radio * radio;
        volumen = 4.0 * Math.PI * radio * radio * radio / 3.0;

        System.out.println("\nEl área de la esfera es: " + getArea() +
                "\nEl volumen de la esfera es: " + getVolumen());
    }













}
