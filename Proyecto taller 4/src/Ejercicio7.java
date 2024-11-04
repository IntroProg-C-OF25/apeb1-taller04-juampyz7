import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        //DATOS DE ENTRADA
        double costoKilovatioporhora, kilovatiosConsumidos, edadUsuario, totalPlanilla;
        //ENTRADA DE DATOS
        Scanner teclado = new Scanner(System.in);
        System.out.print("DAME EL COSTO DEL KILOVATIO POR HORA: ");
        costoKilovatioporhora = teclado.nextDouble();
        System.out.print("DAME LA CANTIDAD DE KILOVATIOS CONSUMIDOS EN EL MES: ");
        kilovatiosConsumidos = teclado.nextDouble();
        System.out.print("INGRESE LA EDAD DEL USUARIO: ");
        edadUsuario = teclado.nextDouble();
        //PROCESAMIENTO DE DATOS DE ENTRADA
        if (edadUsuario >= 65)
            System.out.println("SE DESCUENTA EL 10%");
        else 
            System.out.println("NO SE DESCUENTA");
        if (edadUsuario >= 65)
            totalPlanilla = (costoKilovatioporhora * kilovatiosConsumidos) * 0.90;
        else
            totalPlanilla = (costoKilovatioporhora * kilovatiosConsumidos);
        System.out.println("EL VALOR TOTAL A CANCELAR DE LA PLANILLA DE LUZ ES DE:" + totalPlanilla);
   
    }
}

