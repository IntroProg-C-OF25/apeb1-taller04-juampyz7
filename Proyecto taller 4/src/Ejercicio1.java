
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        double base, altura, area;
        Scanner teclado = new Scanner(System.in);
        System.out.print("DAME LA BASE: ");//Carpinteria de salida
        base = teclado.nextDouble();//Datos de entrada
        System.out.println("DAME LA ALTURA: ");
        altura = teclado.nextDouble();
        // PROCESAMIENTO DE DATOS DE ENTRADA
        area = (base * altura) / 2;
        // PRESENTACION DE DATOS DE SALIDA
        System.out.println("Ares del triangulo es = " + area);
    }
}
