import java.util.Scanner;
class Ejercicio3 {
    public static void main(String[] args) {
        //DATOS DE ENTRADA
        int numero;
        //ENTRADA DE DATOS
        Scanner teclado = new Scanner(System.in);
        System.out.print("INGRESAR UN NUMERO ENTRE 2 Y 6: ");
        numero = teclado.nextInt();
        //PROCESAMIENTI DE DATOS DE ENTRADA
        if (numero >= 2 && numero <= 6) {
            System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " * " + i + " = " + (numero * i));
        }
        } else {
            System.out.println("NO SE HA INGRESADO EL NUMERO DENTRO DEL RANGO PERMITIDO");
       
        }
    }
}

 
    
