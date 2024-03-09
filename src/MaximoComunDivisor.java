import java.util.Scanner;

public class MaximoComunDivisor {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("ingresa un numero entero positivo");
        int num1=scanner.nextInt();
        System.out.println("ingrese el segundo numero entero positivo");
        int num2=scanner.nextInt();

        int mcd= calcularMCD(num1, num2);
        System.out.println("el maximo comun divisor es: "+mcd);


    }

   private static int calcularMCD(int num1, int num2) {
        while (num2 !=0){
            int temp =num2;
            num2=num1 % num2;
            num1=temp;

        }
        return num1;
    }
}
