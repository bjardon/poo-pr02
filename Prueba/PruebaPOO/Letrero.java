public class Letrero {
  // Atributos
  private String mensaje; // mensaje a mostrar

  // Constructor por defecto
  public Letrero(){
    this("Hola, mundo!");
  }

  // Constructor con mensaje
  public Letrero(String mensaje){
    this.mensaje = mensaje;
  }

  // Saluda a través de la terminal
  public void mostrarMensaje(){
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
