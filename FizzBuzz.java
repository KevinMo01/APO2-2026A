
import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            String continuar = "si";
            
            while (continuar.equalsIgnoreCase("si")) {
                
                System.out.print("Ingresa un numero: ");
                int numero = scanner.nextInt();
                
                if (numero % 3 == 0 && numero % 5 == 0) {
                    System.out.println("fizz buzz");
                }
                else if (numero % 3 == 0) {
                    
                    System.out.println("fizz");
                }
                else if (numero % 5 == 0) {
                    System.out.println("buzz");
                }
                else {
                    System.out.println("El numero no es multiplo de 3 ni de 5");
                }
                
                System.out.print("Quieres ingresar otro numero? (si/no): ");
                continuar = scanner.next();
            }
            
            System.out.println("Programa finalizado.");
        }
    }
}