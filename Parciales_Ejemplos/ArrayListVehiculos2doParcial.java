package Parciales_Ejemplos;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListVehiculos2doParcial {
   
    public static void main(String[] args) {
        
       /*https://docs.google.com/document/d/1Wl8MDRYgkbu21-hbV3IEjaDqih9dxtlNGrOhL8nbN9I/edit */
    

    /*Este examen práctico consta de 10 partes, cada una relacionada con una tarea específica del programa de gestión de venta de vehículos. 
    Para cada parte, deberá crear un programa Java que implemente la funcionalidad requerida. Asegúrese de seguir las instrucciones 
    cuidadosamente y de escribir código claro, conciso y bien documentado.
    Evite utilizar programación orientada a objetos en este examen. */

    ArrayList <String> vehiculos = new ArrayList<>(); 
    Scanner sc = new Scanner(System.in);
    int opcion;
    
 
    do {

        //funcion para mostrar el menu
        mostrarMenu();
        opcion = sc.nextInt();
        sc.nextLine();//consumir salto de linea
       



        switch (opcion) {

                case 1:
                System.out.println("Ingrese el nombre del vehiculo para agregar al registro");
                String agregarAuto = sc.nextLine();
                agregarAuto(vehiculos, agregarAuto);

                break;

                case 2:
                System.out.println("Ingrese el nombre del vehiculo para buscar");
                String autoBuscar = sc.nextLine();
                buscarAuto(vehiculos, autoBuscar);

                break;

                case 3:
                System.out.println("Ingresar el nombre del auto para eliminar");
                String borrarAuto = sc.nextLine();
                eliminarAuto(vehiculos, borrarAuto);

                break;

                case 4:
                
                System.out.println(listarAutos(vehiculos));


                break;

                case 5:

                ordenarAutos(vehiculos);

                break ;

                case 6:

                System.out.println("ingrese el indice del auto a editar");
                int indice = sc.nextInt();
                sc.nextLine();// limpio
                System.out.println("Ingrese el nombre del auto: ");
                String nuevoNombre = sc.nextLine();
                editarAuto(vehiculos, indice, nuevoNombre);
                
                break;

                case 7:
                System.out.println("Saliendo del programa, Gracias por operar!");
                break;
        
            default:
                System.out.println("Ingrese una opción válida");
                break;
        }

    } while (opcion != 7); 

    sc.close();

}


    public static void mostrarMenu() {
        System.out.println("::::::::::::MENU DE OPCIONES::::::::::::");
        System.out.println("Por favor ingrese la opcion deseada para comenzar a operar: ");
        System.out.println("1.Agregar vehiculo"); 
        System.out.println("2.Buscar vehiculo");
        System.out.println("3.Eliminar vehiculo");
        System.out.println("4.Listar vehiculos");
        System.out.println("5.Ordenar vehiculos");
        System.out.println("6.Editar vehiculo indicando el indice");
        System.out.println("7.Salir del programa");
        System.out.println("::::::::::::MENU DE OPCIONES::::::::::::");
    }

    public static void agregarAuto(ArrayList <String> vehiculos, String agregaAuto) {
        vehiculos.add(agregaAuto);
        System.out.println("Agregado exitosamente!");
        
    }

    public static void buscarAuto(ArrayList<String> vehiculos, String buscarAuto) {
        int indice = vehiculos.indexOf(buscarAuto);
        if (indice != -1) {
            System.out.println(buscarAuto +" fue encontrado en la posición: " + indice);
        } else {
            System.out.println("No se encontró el auto.");
        }
        

    }



    public static void eliminarAuto (ArrayList<String> vehiculos, String borrarAuto) {

        if (vehiculos.remove(borrarAuto)) {
            System.out.println("borrado exitosamente");

        } else { System.out.println("No encontrado");}
                                                            

        
    }


    public static String listarAutos(ArrayList<String> vehiculos) {
        System.out.println("Listado de autos:");
        String listaautos = "";
        //Iteración y concatenación
        for (String vehiculo: vehiculos) {
          listaautos += vehiculo + "\n";
        }
        //retorno el string con los registros del arreglo
        return listaautos;
      }




    public static void ordenarAutos(ArrayList<String> vehiculos) {
        Collections.sort(vehiculos);
        System.out.println("Autos ordenados alfabeticamente");
        
    }

    public static void editarAuto (ArrayList<String> vehiculos, int indice, String nuevoNombre) {

        if (indice >= 0 && indice < vehiculos.size()) {

            vehiculos.set(indice, nuevoNombre);
            System.out.println("Editado correctamente" );
        } else { 
            
            System.out.println("No encontrado, indice invalido");
        }

        
    }
    
}







