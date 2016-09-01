import java.util.Scanner;

public class BancoPatito {
  public static void main(String[] args) {
    ChequePOO cheque;
    ImpresoraChequesPOO impresora = new ImpresoraChequesPOO();
    Scanner scan = new Scanner(System.in);
    String nombre;
    String cantidad;

    System.out.println("Nombre del beneficiario del cheque");
    nombre = scan.nextLine();
    System.out.println("Cantidad del cheque");
    cantidad = scan.nextLine();

    cheque = new ChequePOO(nombre, cantidad);
    impresora.setCheque(cheque);
    impresora.imprimir();
  }
}
