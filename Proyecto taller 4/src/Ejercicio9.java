
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        //DATOS DE ENTRADA
        double ladoCuadrado, areaCuadrado, alturaRectangulo, areaTriangulo, areaRectangulo, areaPoligono;
        //ENTRADA DE DATOS
        Scanner teclado = new Scanner(System.in);
        System.out.print("DAME EL LADO DEL CUADRADO: ");
        ladoCuadrado = teclado.nextDouble();
        System.out.print("DAME LA ALTURA DEL RECTANGULO: ");
        alturaRectangulo = teclado.nextDouble();
        //PROCESAMIENTO DE DATOS DE ENTRADA
        areaCuadrado = Math.pow(ladoCuadrado,2);
        System.out.println("Area del cuadrado:-" + areaCuadrado);
        areaTriangulo = (ladoCuadrado + alturaRectangulo) / 2;
        System.out.println("Area de los triangulos: " + areaTriangulo);
        areaRectangulo = (ladoCuadrado * alturaRectangulo);
        System.out.println("Area del rectangulo: " + areaRectangulo);
        areaPoligono = (Math.pow(ladoCuadrado,2) + 3 * (ladoCuadrado * alturaRectangulo / 2) + ladoCuadrado * alturaRectangulo);
        System.out.println("EL AREA DEL POLIGONO ES DE: " + areaPoligono);
        
        
    
    }
}
