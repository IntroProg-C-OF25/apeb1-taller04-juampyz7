import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        //DATOS DE ENTRADA
        double CPU, teclado, pantalla, raton, costoTotal;
        //ENTRADA DE DATOS
        Scanner escrito = new Scanner(System.in);
        System.out.print("DAME EL COSTO DEL CPU: ");
        CPU = escrito.nextDouble();
        System.out.print("DAME EL COSTO DEL TECLADO: ");
        teclado = escrito.nextDouble();
        System.out.print("DAME EL COSTO DEL PANTALLA: ");
        pantalla = escrito.nextDouble();
        System.out.print("DAME EL COSTO DEL RATON: ");
        raton = escrito.nextDouble();
        //PROCESAMIENTO DE DATOS DE ENTRADA
        costoTotal = CPU + teclado + pantalla + raton;
        System.out.println("EL COSTO TOTAL DE LA COMPUTADORA DE ESCRITORIO ES: " + costoTotal);
        
        
            
        
        
        
        
    }
}
