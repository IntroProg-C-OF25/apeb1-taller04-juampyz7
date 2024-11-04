import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        //DATOS DE ENTRADA
        double montoPrestamo, interesMensual, plazoMeses, pagoMensual;
        //ENTRADA DE DATOS
        Scanner teclado = new Scanner(System.in);
        System.out.print("DAME EL MONTO DEL PRESTAMO: ");
        montoPrestamo = teclado.nextDouble();
        System.out.print("DAME EL INTERES MENSUAL DEL PRESTAMO: ");
        interesMensual = teclado.nextDouble(); 
        //DEFINIR EL PLAZO EN MESES 
        plazoMeses = 12;
        //PROCESAMIENTO DE DATOS DE ENTRADA
        pagoMensual = (montoPrestamo/plazoMeses) + interesMensual;
        System.out.println("EL PAGO MENSUAL DEL PRESTAMO EN 12 MESES DE PLAZO ES DE: " + pagoMensual);
        
        
        
        
        
        
        
        
        
    }
}
