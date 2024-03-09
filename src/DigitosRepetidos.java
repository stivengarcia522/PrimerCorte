import java.util.Scanner;

public class DigitosRepetidos {

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        int e =0;

        System.out.println("ingrese un numero entero positivo ");
        int num1 = scanner.nextInt();
        System.out.println("ingrese un digito por favor ");
        int num2 = scanner.nextInt();

        while(num1 > 0) {
            int ultimo = num1 % 10;
            if(ultimo==num2){
                e++;
            }
            num1 /= 10;

        }

        System.out.println("el digito:" + num2 +"se repite :" + e +" veces");


    }
}
