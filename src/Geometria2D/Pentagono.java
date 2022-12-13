package Geometria2D;
import java.util.Scanner;
public class Pentagono {
    private double area, perimetro, apotema;
    Scanner leer = new Scanner(System.in);
    public Pentagono(double area, double perimetro, double volumen) {
        this.area = area;
        this.perimetro = perimetro;
        this.apotema = volumen;
    }
    public void Area_Pentagono(){
        System.out.println("Ingrese la perimetro del pentagono");
        double perimetro= leer.nextDouble();
        System.out.println("Ingrese la apotema del pentagono");
        double apotema= leer.nextDouble();
        area= (perimetro*apotema)/2;
        System.out.println("El Area del Pentagono es:" + area);

    }
    public void Perimetro_Pentagono(){
        System.out.println("Ingrese la longitud del primer lado:");
        double diametro1= leer.nextDouble();
        System.out.println("Ingrese la longitud del segundo lado:");
        double diametro2= leer.nextDouble();
        System.out.println("Ingrese la longitud del tercer lado:");
        double diametro3= leer.nextDouble();
        System.out.println("Ingrese la longitud del cuarto lado:");
        double diametro4= leer.nextDouble();
        System.out.println("Ingrese la longitud del quinto lado:");
        double diametro5= leer.nextDouble();
        perimetro= diametro1+diametro2+diametro3+diametro4+diametro5;
        System.out.println("El Perimetro del Pentagono equilatero es:" + perimetro);
    }
    public void Apotema_Pentagono(){
        System.out.println("Ingrese el lado del pentagono:");
        double lado= leer.nextDouble();
        System.out.println("Ingrese la angulo del pentagono");
        double angulo= leer.nextDouble();
        apotema=lado/2*Math.tan(lado);
        System.out.println("El apotema del Pentagono es:" + apotema);
    }
}