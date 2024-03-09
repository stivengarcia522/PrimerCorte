import java.util.Scanner;

public class OrdenamientoNumero {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("ingresa un numero entero");
        int num1= scanner.nextInt();

        System.out.println("ingrese otro numero entero");
        int num2= scanner.nextInt();

        System.out.println("ingrese otro numero entero");
        int num3= scanner.nextInt();

        int mayor=num1;
        if(num2> mayor){
            mayor=num2;
        }
        if(num3> mayor){
            mayor=num3;
        }

        int menor=num1;
        if(num2< menor){
            menor=num2;
        }
        if(num3< menor){
            menor=num3;
        }

        int intermedio=num1+num2+num3-mayor-menor;

        System.out.println("el numero mayor es: " + mayor);
        System.out.println("el numero menor es: " + menor);
        System.out.println("el numero intermedio es: " + intermedio);
    }

}
