import java.util.Scanner;
public class AñoBifiesto {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int ano =0;

            System.out.println("ingresa el año a consultar: ");
            ano= scanner.nextInt();

            if ((ano%4==0) && (ano%100!=0) || (ano%400==0)){

                System.out.println("el año ingresado es bifiesto");
            }else {
                System.out.println("el año ingresado no es bifiesto");
            }

        }
    }


