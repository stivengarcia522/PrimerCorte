import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();

        System.out.println("el sistema te dara dos numero para que luego realizes la suma ");

        int num1=random.nextInt(10) +1;
        int num2= random.nextInt(10) +1;

        int suma1=num1+num2;

        System.out.println("el primer numero es: "+num1);
        System.out.println("el segundo numero es: "+ num2);

        System.out.println("ingrese las suma de los numeros aneteriores");
        int suma2=scanner.nextInt();

        if(suma2==suma1){
            System.out.println("la resputa es correcta");
        }else {
            System.out.println("la respuesta es erronea");

        }
    }
}
