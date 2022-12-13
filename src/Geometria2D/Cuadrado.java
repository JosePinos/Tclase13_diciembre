package Geometria2D;
import java.util.Scanner;
public class Cuadrado {
    private double area, perimetro, volumen;
    Scanner leer = new Scanner(System.in);
    public Cuadrado(double area, double perimetro, double volumen) {
        this.area = area;
        this.perimetro = perimetro;
        this.volumen = volumen;
    }
    public void Area_Cuadrado(){
        System.out.println("Ingrese la base del cuadrado");
        double base= leer.nextDouble();
        System.out.println("Ingrese la altura del cuadrado");
        double altura= leer.nextDouble();
        if(base!=altura){
            System.out.println("La base y la altura no coinciden por ende no es un cuadrado");
        }
        else{
            area= altura*base;
            System.out.println("El Area del Cudrado es:" + area);
        }
    }
    public void Perimetro_Cuadrado(){
        System.out.println("Ingrese la longitud del primer lado:");
        double diametro1= leer.nextDouble();
        System.out.println("Ingrese la longitud del segundo lado:");
        double diametro2= leer.nextDouble();
        System.out.println("Ingrese la longitud del tercer lado:");
        double diametro3= leer.nextDouble();
        System.out.println("Ingrese la longitud del cuarto lado:");
        double diametro4= leer.nextDouble();
        perimetro= diametro1+diametro2+diametro3+diametro4;
        System.out.println("El Perimetro del Cuadrado es:" + perimetro);
    }
}