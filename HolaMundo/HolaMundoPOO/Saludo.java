/**
  * La clase Saludo es el resultado de abstraer un saludo y el proceso
  * de saludar.
  *
  * Contiene un atributo mensaje que contiene el mensaje con el que se
  * va a saludar.
  *
  * Contiene dos constructores sobrecargados; uno por defecto y otro
  * que recibe un mensaje.
  *
  * Contiene un método saludar que imprime el mensaje a la pantalla.
  *
  * Contiene un método setMensaje que cambia el mensaje por la cadena
  * recibida.
  *
  * Contiene un método destruir que destruye la clase para eliminar
  * el objeto de la menmoria.
  *
  */

public class Saludo {
  // Atributos
  private String mensaje; // mensaje a mostrar

  // Constructor por defecto
  public Saludo(){
    this("Hola, mundo!");
  }

  // Constructor con mensaje
  public Saludo(String mensaje){
    this.mensaje = mensaje;
  }

  // Saluda a través de la terminal
  public void saludar(){
    System.out.println(this.mensaje);
  }

  // Cambia el mensaje por el String introducido
  public void setMensaje(String mensaje){
    this.mensaje = mensaje;
  }

  // Obtiene el mensaje
  public String getMensaje(){
    return this.mensaje;
  }

  // Destructor
  public void destruir(){
    this.mensaje = null;
    System.gc();
  }

}
