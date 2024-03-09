import java.util.Scanner;

public class SumaDigitos {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int numero;
            int resultado = 0;

            System.out.print("Introduce un número para sumar sus dígitos: ");

            numero = scanner.nextInt();

            while(numero > 0) {

                resultado =resultado+ numero % 10;
                numero = numero / 10;

            }

            System.out.println("La suma es: " + resultado);

        }

    }


