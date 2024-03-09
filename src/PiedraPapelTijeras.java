import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijeras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int opcionUsuario;

        int piedra = 1;
        int papel = 2;
        int tijeras = 3;

        System.out.println("juego de piedra, papel o tijeras ");


        System.out.println("escoje una opcion para jugar" +
                    "1 para piedra, 2 para papel o 3 para tijeras");
        opcionUsuario = scanner.nextInt();
        if (opcionUsuario < 1 || opcionUsuario > 3) {
                System.out.println("opcion invalida por favor escoja otra opcion ");

            }

            int numeroAleatorio = random.nextInt(3) + 1;


        System.out.println("escojiste: "+opcionUsuario);
        System.out.println("la computadora escojio: "+numeroAleatorio);



            if (opcionUsuario == numeroAleatorio) {
                System.out.println("Empate!");
            } else if ((opcionUsuario == piedra && numeroAleatorio == tijeras) ||
                    (opcionUsuario == papel && numeroAleatorio == piedra) ||
                    (opcionUsuario == tijeras && numeroAleatorio == papel)) {
                System.out.println("Ganaste");

            } else {
                System.out.println("perdiste ");
            }




    }
}