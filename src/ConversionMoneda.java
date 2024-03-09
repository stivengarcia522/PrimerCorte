import java.util.Scanner;

public class ConversionMoneda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el valor en dolares que desea convertir a pesos");
        double dolar= scanner.nextDouble();

        double peso= 3950;
        double total=peso*dolar;
        System.out.println("el dolar el dia de hoy esta a $3950");

        System.out.println("su dinero en dolar es: "+total);





    }
}
