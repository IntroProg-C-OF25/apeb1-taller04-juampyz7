
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        //DATOS DE ENTRADA
        double netflix, youtubePremium, dropbox, spotify, edadUsuario, valorTotal;
        //ENTRADA DE DATOS
        Scanner teclado = new Scanner(System.in);
        System.out.print("DAME EL COSTO MENSUAL DE NETFLIX: ");
        netflix = teclado.nextDouble();
        System.out.print("DAME EL COSTO MENSUAL DE YOUTUBE PREMIUM: ");
        youtubePremium = teclado.nextDouble();
        System.out.print("DAME EL COSTO MENSUAL DE DROPBOX: ");
        dropbox = teclado.nextDouble();
        System.out.print("DAME EL COSTO MENSUAL DE SPOTIFY: ");
        spotify = teclado.nextDouble();
        System.out.print("INGRESE LA EDAD DEL USUARIO: ");
        edadUsuario = teclado.nextDouble();
        //PROCESAMIENTO DE DATOS DE ENTRADA
        if (edadUsuario <= 30)
            System.out.println("SE DESCUENTA EL 20%");
        else 
            System.out.println("NO SE DESCUENTA");
        if (edadUsuario <= 30)
            valorTotal = (netflix + youtubePremium + dropbox + spotify) * 0.80;
        else
            valorTotal = (netflix + youtubePremium + dropbox + spotify);
        System.out.println("EL VALOR TOTAL A PAGAR MENSUAL POR LOS SERVICIOS DIGITALES DE LA PERSONA ES DE: " + valorTotal);
        
  
    }
    
}
