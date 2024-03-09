import java.util.Scanner;

public class InteresCompuesto {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("ingrese el valor de su inversion");
        double inversion = Scanner.nextDouble();
        System.out.println("ingrese porfavor el interes corriente");
        double interes = Scanner.nextDouble() / 100;
        System.out.println("ingrese el numeros de años que desea dejar la inversion ");
        int tiempo = Scanner.nextInt();


        if (tiempo >= 1) {
            double inversionFinal = inversion * Math.pow(1 + interes, tiempo);  //formula del interes compuesto
            System.out.println("el monto final es:  " + inversionFinal);
        } else {
            System.out.println("requiere por lo menos 1 año para ver reflejados los intereses");
        }

    }

   private static double inversion(float v) {
        return 0;
    }


}
