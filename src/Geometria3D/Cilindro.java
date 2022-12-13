package Geometria3D;
import java.util.RandomAccess;
import java.util.Scanner;

public class Cilindro {

    private double area;
    private double volumen;

    public Cilindro() {
        area = 0.0;
        volumen = 0.0;
    }

    public double getArea(){
        return area;
    }

    public double getVolumen(){
        return volumen;
    }

    public void areaCilindro(){
        Scanner sc = new Scanner(System.in);
        double radio, altura;

        System.out.print("Ingrese el radio del cilindro: ");
        radio = sc.nextDouble();
        while(radio < 0.0){
            System.out.print("Ingrese el radio del cilindro: ");
            radio = sc.nextDouble();
        }

        System.out.print("\nIngrese la altura del cilindro: ");
        altura = sc.nextDouble();
        while(altura < 0.0){
            System.out.print("Ingrese la altura del cilindro: ");
            altura = sc.nextDouble();
        }


        double supLateral = 2.0 * Math.PI * radio * altura;
        double supBase = 2.0 * Math.PI * radio * radio;

        area = supLateral + supBase;

        System.out.println("\nEl área del cilindro es: " + getArea() );

    }


    public void volumenCilindro(){
        Scanner sc = new Scanner(System.in);
        double radio, altura;

        System.out.print("Ingrese el radio del cilindro: ");
        radio = sc.nextDouble();
        while(radio < 0.0){
            System.out.print("Ingrese el radio del cilindro: ");
            radio = sc.nextDouble();
        }

        System.out.print("\nIngrese la altura del cilindro: ");
        altura = sc.nextDouble();
        while(altura < 0.0){
            System.out.print("Ingrese la altura del cilindro: ");
            altura = sc.nextDouble();
        }

        volumen = Math.PI * radio * radio *altura;

        System.out.println("\nEl volumen del cilindro es: " + getVolumen());

    }





}//FIN DE LA CLASE GEOMETRIA 3D
