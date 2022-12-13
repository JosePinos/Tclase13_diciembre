package Geometria3D;
import java.util.Scanner;
public class Cubo {

    private double area, volumen;

    public Cubo(){
        area = 0.0;
        volumen = 0.0;
    }

    public double getArea() {
        return area;
    }

    public double getVolumen() {
        return volumen;
    }


    public void area_volumenCubo(){
        Scanner sc = new Scanner(System.in);
        double lado;

        System.out.print("Ingrese el lado del cubo: ");
        lado = sc.nextDouble();
        while(lado < 0.0){
            System.out.print("Ingrese el lado del cubo: ");
            lado = sc.nextDouble();
        }



        area = 6.0 * lado * lado;
        volumen = Math.pow(lado, 3.0);

        System.out.println("\nEl área del cubo es: " + getArea() +
                "\nEl volumen del cubo es: " + getVolumen());

    }










}
