
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //DATOS DE ENTRADA
        double gastoHijo1, gastoHijo2, gastoHijo3, gastoTotal;
        //ENTRADA DE DATOS
        Scanner teclado = new Scanner(System.in);
        System.out.print("DAME EL GASTO DEL HIJO 1: ");
        gastoHijo1 = teclado.nextDouble();
        System.out.print("DAME EL GASTO DEL HIJO 2: ");
        gastoHijo2 = teclado.nextDouble();
        System.out.print("DAME EL GASTO DEL HIJO 3: ");
        gastoHijo3 = teclado.nextDouble();
        //PROCESAMIENTO DE DATOS DE ENTRADA
        gastoTotal = gastoHijo1 + gastoHijo2 + gastoHijo3;
        System.out.println("EL TOTAL DE GASTOS DE LOS 3 HIJOS ES: " + gastoTotal);
        
        
     
        
        
        
    }
}
