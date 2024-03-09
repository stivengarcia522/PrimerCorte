import java.util.*;

public class EliminarDuplicados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una lista
        List<Integer> lista = new ArrayList<>();

        // Solicitar al usuario que ingrese los elementos de la lista
        System.out.println("Ingrese los elementos de la lista (ingrese 'fin' para terminar):");
        String input;
        while (true) {
            input = scanner.nextLine();
            if (input.equals("fin")) {
                break;
            }
            try {
                int numero = Integer.parseInt(input);
                lista.add(numero);
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número válido o 'fin' para terminar.");
            }
        }

        System.out.println(" La lista ingresada es: " + lista);

        Set<Integer> conjunto = new HashSet<>(lista);

        lista.clear();
        lista.addAll(conjunto);

        System.out.println("Lista sin duplicados es :");
        for (Integer elemento : lista) {
            System.out.println(elemento);
        }

    }
}