package Geometria2D;
import java.util.Scanner;
public class Circulo {
    private double area, perimetro, diametro;
    Scanner leer = new Scanner(System.in);
    public Circulo(double area, double perimetro, double volumen) {
        this.area = area;
        this.perimetro = perimetro;
        this.diametro = volumen;
    }
    public void Area_Circulo(){
        System.out.println("Ingrese el diametro del circulo");
        double diametro= leer.nextDouble();
        area= Math.PI*(Math.pow(diametro,2));
        System.out.println("El Area del Circulo es:" + area);
    }
    public void Perimetro_Circulo(){
        System.out.println("Ingrese el diametro del circulo");
        double diametro= leer.nextDouble();
        perimetro= Math.PI*diametro;
        System.out.println("El Perimetro del Circulo es:" + perimetro);
    }
    public void Diametro_Circulo(){
        System.out.println("Ingrese el area del circulo");
        double area= leer.nextDouble();
        diametro=area*2;
        System.out.println("El Diametro del Circulo es:" + diametro);
    }
}
