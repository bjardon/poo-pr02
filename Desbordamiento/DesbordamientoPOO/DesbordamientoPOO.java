public class DesbordamientoPOO {
	public static void main(String args[]){
		long positivo = 500000000 + 500000;

		long negativo = -2- 20000;
		Mensaje mensaje = new Mensaje("Positivo: " + positivo + "\nNegativo: " + negativo);
		mensaje.mostrarMensaje();
	}
}