import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {
        // Crear un escáner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un valor
        System.out.println("Ingrese un valor (por ejemplo, 'saludo', 'despedida', 'pregunta'): ");
        String input = scanner.nextLine();

        // Usar una estructura switch para decidir el mensaje basado en el valor de entrada
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

            default:
                // Este bloque se ejecuta si el valor de entrada no coincide con ningún caso anterior
                System.out.println("Entrada no reconocida. Por favor, intenta nuevamente.");
                break; // Finaliza el switch
        }

        // Cerrar el escáner
        scanner.close();
    }
}
