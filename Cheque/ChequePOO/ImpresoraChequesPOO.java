public class ImpresoraChequesPOO {
  private ChequePOO cheque;

  public ImpresoraChequesPOO(){
    this(new ChequePOO());
  }

  public ImpresoraChequesPOO(ChequePOO cheque){
    this.cheque = new ChequePOO(cheque);
  }

  public void setCheque(ChequePOO cheque){
    this.cheque = new ChequePOO(cheque);
  }

  public void imprimir(){
    System.out.println("\n\n\t\tImprimiendo cheque...\n\n");
    System.out.println("+---------------------------------------------------------------------------------------+");
    System.out.println("| Banco Patito de Mexico \t\t\t\tFecha:_________________ \t|");
    System.out.println("| Nombre: " + cheque.getNombre());
    System.out.println("| Cantidad c/letra: " + cheque.getCantidadLetra() + "\t\t" + "$ " + cheque.getCantidadNumero() + "\t\t|");
    System.out.println("|                                                            \t\t\t\t|");
    System.out.println("| Firma:_________________                                    \t\t\t\t|");
    System.out.println("+---------------------------------------------------------------------------------------+");
  }

}
