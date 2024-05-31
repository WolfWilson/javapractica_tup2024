import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

    public static void main(String[] args) {
        // Crear un escáner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Crear un ArrayList para almacenar las posibles entradas
        ArrayList<String> options = new ArrayList<>();
        options.add("saludo");
        options.add("despedida");
        options.add("pregunta");

        // Solicitar al usuario que ingrese un valor
        System.out.println("Ingrese un valor (por ejemplo, 'saludo', 'despedida', 'pregunta'): ");
        String input = scanner.nextLine();

        // Verificar la entrada del usuario y mostrar el mensaje correspondiente
        if (options.contains(input)) {
            switch (input) {
                case "saludo":
                    System.out.println("¡Hola! ¿Cómo estás?");
                    break; // Finaliza esta rama del switch

                case "despedida":
                    System.out.println("¡Adiós! Que tengas un buen día.");
                    break; // Finaliza esta rama del switch

                case "pregunta":
                    System.out.println("¿En qué puedo ayudarte?");
                    break; // Finaliza esta rama del switch
            }
        } else {
            // Este bloque se ejecuta si el valor de entrada no coincide con ninguna opción en el ArrayList
            System.out.println("Entrada no reconocida. Por favor, intenta nuevamente.");
        }

        // Cerrar el escáner
        scanner.close();
    }
}
