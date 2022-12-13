package Geometria3D;
import java.util.Scanner;

public class Cono {

    private double area;
    private double volumen;

    public Cono() {
        area = 0.0;
        volumen = 0.0;
    }

    public double getArea() {
        return area;
    }

    public double getVolumen() {
        return volumen;
    }

    public void areaCono(){
        Scanner sc = new Scanner(System.in);
        double radio, altura, generatriz;

        System.out.print("Ingrese el radio del cono: ");
        radio = sc.nextDouble();
        while(radio < 0.0){
            System.out.print("Ingrese el radio del cono: ");
            radio = sc.nextDouble();
        }

        System.out.print("\nIngrese la altura del cono: ");
        altura = sc.nextDouble();
        while(altura < 0.0){
            System.out.print("Ingrese la altura del cono: ");
            altura = sc.nextDouble();
        }

        System.out.print("\nIngrese la generatriz del cono:  ");
        generatriz = sc.nextDouble();
        while(generatriz < 0.0){
            System.out.print("Ingrese la generatriz del cono: ");
            generatriz = sc.nextDouble();
        }



        area = Math.PI * radio * (generatriz + radio) ;

        System.out.println("\nEL área del cono es: " + getArea());
    }


    public void volumenCono(){
        Scanner sc = new Scanner(System.in);
        double radio, altura, generatriz;

        System.out.print("Ingrese el radio del cono: ");
        radio = sc.nextDouble();
        while(radio < 0.0){
            System.out.print("Ingrese el radio del cono: ");
            radio = sc.nextDouble();
        }

        System.out.print("\nIngrese la altura del cono: ");
        altura = sc.nextDouble();
        while(altura < 0.0){
            System.out.print("Ingrese la altura del cono: ");
            altura = sc.nextDouble();
        }


        volumen = Math.PI * radio * radio * altura / 3.0;
        System.out.println("\nEl volúmen del cono es: " + getVolumen());

    }















}




