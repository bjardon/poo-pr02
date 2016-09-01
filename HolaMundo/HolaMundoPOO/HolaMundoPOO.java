/**
  * La clase HolaMundoPOO crea cuatro objetos; dos de tipo Saludo para
  * saludar por medio de la terminal, uno de tipo Scanner para recibir
  * entrada de la terminal y uno de tipo String para almacenar un mensaje.
  *
  * Define dos saludos para utilizar diferentes constructores.
  *
  */

import java.util.Scanner;

public class HolaMundoPOO {
  public static void main(String[] args) {
    // Definición del saludo1 con el constructor por defecto
    Saludo saludo1 = new Saludo();
    // Definición del saludo2 con el constructor que recibe una cadena
    Saludo saludo2 = new Saludo("Hola Java, soy Bruno y yo programé esto. Me gusta que Java sí se pueden usar acentos en la terminal.");
    // Definición del Scanner para la entrada del sistema
    Scanner scanner = new Scanner(System.in);
    // Definción de una cadena mensaje
    String mensaje;

    // Pide al usuario un saludo
    System.out.println("Ingrese un saludo que se guardará en el objeto saludo1: ");
    // Lee el saludo de la terminal
    mensaje = scanner.nextLine();
    // Guarda el saludo en el atributo mensaje de saludo1
    saludo1.setMensaje(mensaje);

    // Saludo 1
    System.out.println("\n\nSaludo 1 (Leído desde consola):");
    saludo1.saludar(); // Llamada al método saludar de saludo1

    // Saludo 2
    System.out.println("\nSaludo 2 (Con atributo mensaje arbitrario):");
    saludo2.saludar(); // Llamada al método saludar de saludo2

    // Destrucción de todos los objetos
    saludo1.destruir();
    saludo2.destruir();
    saludo1 = null;
    saludo2 = null;
    scanner = null;
    mensaje = null;
    System.gc();

  }
}
/**
  * El programa ahora está en el paradigma orientado a objetos
  * pues utiliza objetos de los tipos Saludo, Scanner y String.
  *
  * De igual forma, manda llamar el método estático println de
  * la clase System.
  *
  */
