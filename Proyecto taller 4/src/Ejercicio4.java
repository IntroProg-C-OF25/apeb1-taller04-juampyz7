
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //DECLARACION DE DATOS DE ENTRADA
        double costoMinuto, cantidadMinutos, valorPlanilla;
        //BLOQUE  DE ENTRADA DE DATOS
        Scanner teclado = new Scanner(System.in);
        System.out.print("DAME COSTO POR MINUTO: ");
        costoMinuto = teclado.nextDouble ();
        System.out.print("DAME LA CANTIDAD POR MINUTOS: ");
        cantidadMinutos = teclado.nextDouble();
        //BLOQUE DE PROCESAMIENTO DE DATOS DE ENTRADA
        valorPlanilla = costoMinuto * cantidadMinutos;
        //BLOQUE DE SALIDA DE RESULTADOS
        System.out.println("VALOR DE LA PLANILLA DE TELEFONO ES: " + valorPlanilla);
        
        
        
    }
}
