
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            String continuar = "si";
            
            while (continuar.equalsIgnoreCase("si")) {
                
                System.out.print("Ingresa un numero: ");
                int numero = scanner.nextInt();
                
                long factorial = 1;
                for (int i = 1; i <= numero; i++) {
                    factorial *= i;
                }
                System.out.println("El factorial de " + numero + " es: " + factorial);
                
                System.out.print("Quieres ingresar otro numero? (si/no): ");
                continuar = scanner.next();
            }
            
            System.out.println("Programa finalizado.");
        }
    }
}