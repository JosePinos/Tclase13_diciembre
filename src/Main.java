import Geometria3D.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Cilindro myCil = new Cilindro();
        System.out.println( myCil.getArea(5,10) );

        Tetraedro myTetra = new Tetraedro();
        System.out.println(myTetra.getArea(10));

    }//fin del método de main
}