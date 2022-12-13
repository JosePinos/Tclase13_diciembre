package Geometria3D;
import java.util.Scanner;
public class Poliedro {

    private double area, volumen;

    public Poliedro(){
        area = 0.0;
        volumen = 0.0;
    }


    public void areaOctoedro(){
        Scanner sc = new Scanner(System.in);
        double lado;

        System.out.print("Ingrese el lado del octoedro: ");
        lado = sc.nextDouble();

        area = 2.0 * lado * lado * Math.sqrt(3.0);
        System.out.println("El área del Octoedro es: " + area);
    }

    public void volumenOctoedro(){
        Scanner sc = new Scanner(System.in);
        double lado;

        System.out.print("Ingrese el lado del octoedro: ");
        lado = sc.nextDouble();

        volumen = lado * lado * lado * Math.sqrt(2.0)/3.0;
        System.out.println("El área del Octoedro es: " + volumen);
    }


    public void diagonalOctoedro(){
        Scanner sc = new Scanner(System.in);
        double lado;

        System.out.print("Ingrese el lado del octoedro: ");
        lado = sc.nextDouble();

        System.out.println("\nLa diagonal del octoedro es: " + (lado * Math.sqrt(2.0)) );
    }


}
