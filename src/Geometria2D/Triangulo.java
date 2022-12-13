package Geometria2D;
import java.util.Scanner;
public class Triangulo {
    private double area, perimetro, volumen;
    Scanner leer = new Scanner(System.in);
    public Triangulo(double area, double perimetro, double volumen) {
        this.area = area;
        this.perimetro = perimetro;
        this.volumen = volumen;
    }
    public void Area_Triangulo(){
        System.out.println("Ingrese la base del triangulo");
        double base= leer.nextDouble();
        System.out.println("Ingrese la altura del triangulo");
        double altura= leer.nextDouble();
        area= (base*altura)/2;
        System.out.println("El Area del triangulo es:" + area);

    }
    public void Perimetro_Triangulo(){
        System.out.println("Ingrese el lado del triangulo equilatero:");
        double lado= leer.nextDouble();
        perimetro= lado*3;
        System.out.println("El Perimetro del triangulo equilatero es:" + perimetro);
    }
    public void Volumen_Triangulo(){
        System.out.println("Ingrese el area del circulo");
        double area= leer.nextDouble();
        System.out.println("Ingrese la altura del triangulo");
        double altura= leer.nextDouble();
        System.out.println("Ingrese la largo del triangulo");
        double largo= leer.nextDouble();
        volumen=altura*altura*largo;
        System.out.println("El volumen del triangulo es:" + volumen);
    }
}