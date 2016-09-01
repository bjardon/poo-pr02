public class ChequePOO {
  private String nombre = "";
  private String cantidadNumero = "";
  private String cantidadLetra = "";
  private int aux = 0;
	private int decena = 0;
  private int mil = 0;

  public ChequePOO(){
    this("Al Portador", "0");
  }

  public ChequePOO(String cantidad){
    this("Al Portador", cantidad);
  }

  public ChequePOO(ChequePOO cheque){
    this(cheque.getNombre(), cheque.getCantidadNumero());
  }

  public ChequePOO(String nombre, String cantidad){
    this.nombre = nombre;
    this.cantidadNumero = cantidad;
    this.determinarCantidadLetra();
  }

  private String generarPalabra(int digito, int mult){
    String palabra = this.cantidadLetra;
    String cantidad = this.cantidadNumero;
    switch (mult) {
        case 1: {
              if (decena != 1) {
                if (digito == 1)
                    palabra += "uno";
                if (digito == 2)
                    palabra += "dos";
                if (digito == 3)
                    palabra += "tres";
                if (digito == 4)
                    palabra += "cuatro";
                if (digito == 5)
                    palabra += "cinco";
                if (digito == 6)
                    palabra += "seis";
                if (digito == 7)
                    palabra += "siete";
                if (digito == 8)
                    palabra += "ocho";
                if (digito == 9)
                    palabra += "nueve";
            }
            break;
        }
        case 2: {
            if (digito == 1) {
                if (cantidad.charAt(aux + 1) == '1') ;
                palabra += "once ";
                if (cantidad.charAt(aux + 1) == '2')
                    palabra += "doce ";
                if (cantidad.charAt(aux + 1) == '3')
                    palabra += "trece ";
                if (cantidad.charAt(aux + 1) == '4')
                    palabra += "catorce ";
                if (cantidad.charAt(aux + 1) == '5')
                    palabra += "quince ";
                if (cantidad.charAt(aux + 1) == '6')
                    palabra += "dieciseis ";
                if (cantidad.charAt(aux + 1) == '7')
                    palabra += "diecisiete ";
                if (cantidad.charAt(aux + 1) == '8')
                    palabra += "dieciocho ";
                if (cantidad.charAt(aux + 1) == '9')
                    palabra += "diecinueve ";
                decena++;
                mult--;
            }
            if (digito == 2)
                palabra += "veinti";
            if (digito == 3)
                palabra += "treinta y ";
            if (digito == 4)
                palabra += "cuarenta y ";
            if (digito == 5)
                palabra += "cincuenta y ";
            if (digito == 6)
                palabra += "sesenta y ";
            if (digito == 7)
                palabra += "sesenta y ";
            if (digito == 8)
                palabra += "ochenta y ";
            if (digito == 9)
                palabra += "noventa y ";
            break;
        }
        case 3: {
            if (digito == 1)
                palabra += "ciento ";
            if (digito == 2)
                palabra += "doscientos ";
            if (digito == 3)
                palabra += "trescientos ";
            if (digito == 4)
                palabra += "cuatrocientos ";
            if (digito == 5)
                palabra += "quinientos ";
            if (digito == 6)
                palabra += "seiscientos ";
            if (digito == 7)
                palabra += "setecientos ";
            if (digito == 8)
                palabra += "ochocientos ";
            if (digito == 9)
                palabra += "novecientos ";
            break;
        }
        case 4: {
            if (mil != 1) {
                if (digito == 1)
                    palabra += "un mil ";
                if (digito == 2)
                    palabra += "dos mil ";
                if (digito == 3)
                    palabra += "tres mil ";
                if (digito == 4)
                    palabra += "cuatromil ";
                if (digito == 5)
                    palabra += "cincomil ";
                if (digito == 6)
                    palabra += "seismil ";
                if (digito == 7)
                    palabra += "sietemil ";
                if (digito == 8)
                    palabra += "ochomil ";
                if (digito == 9)
                    palabra += "nuevemil ";
            }
            break;
        }
        case 5: {
            if (digito == 1) {
                if (cantidad.charAt(aux + 1) == '1')
                    palabra += "once mil ";
                if (cantidad.charAt(aux + 1) == '2')
                    palabra += "doce mil";
                if (cantidad.charAt(aux + 1) == '3')
                    palabra += "trece mil";
                if (cantidad.charAt(aux + 2) == '4')
                    palabra += "catorce mil";
                if (cantidad.charAt(aux + 1) == '5')
                    palabra += "quince mil";
                if (cantidad.charAt(aux + 1) == '6')
                    palabra += "dieciseis mil";
                if (cantidad.charAt(aux + 1) == '7')
                    palabra += "diecisiete mil";
                if (cantidad.charAt(aux + 1) == '8')
                    palabra += "dieciocho mil";
                if (cantidad.charAt(aux + 1) == '9')
                    palabra += "diecinueve mil";
                mil++;
                mult--;
            }
            if (digito == 2)
                palabra += "veinte y ";
            if (digito == 3)
                palabra += "treinta y ";
            if (digito == 4)
                palabra += "cuarenta y ";
            if (digito == 5)
                palabra += "cincuenta y ";
            if (digito == 6)
                palabra += "sesenta y ";
            if (digito == 7)
                palabra += "setenta y ";
            if (digito == 8)
                palabra += "ochenta y ";
            if (digito == 9)
                palabra += "noventa ";
            break;
        }
        case 6: {
            if (digito == 1)
                palabra += "ciento ";
            if (digito == 2)
                palabra += "doscientos ";
            if (digito == 3)
                palabra += "trescientos ";
            if (digito == 4)
                palabra += "cuatrocientos ";
            if (digito == 5)
                palabra += "quinientos ";
            if (digito == 6)
                palabra += "seiscientos ";
            if (digito == 7)
                palabra += "setecientos ";
            if (digito == 8)
                palabra += "ochocientos ";
            if (digito == 9)
                palabra += "novecientos ";
            break;
        }
        case 7: {
            if (digito == 1)
                palabra += "un millon ";
            if (digito == 2)
                palabra += "dos millones ";
            if (digito == 3)
                palabra += "tres millones ";
            if (digito == 4)
                palabra += "cuatro millones ";
            if (digito == 5)
                palabra += "cinco millones ";
            if (digito == 6)
                palabra += "seis millones ";
            if (digito == 7)
                palabra += "siete millones ";
            if (digito == 8)
                palabra += "ocho millones ";
            if (digito == 9)
                palabra += "nueve millones ";
            break;
      }
    }
    return palabra;
  }

  private void determinarCantidadLetra(){
    int mult = this.cantidadNumero.length();
    int digito;
    char caracter;
    while (mult != 0) {
        caracter = cantidadNumero.charAt(aux);
        digito = Integer.parseInt(caracter + "");
        this.cantidadLetra = this.generarPalabra(digito, mult);
        mult--;
        aux++;
    }
  }

  public String getNombre(){
    return this.nombre;
  }

  public String getCantidadNumero(){
    return this.cantidadNumero;
  }

  public String getCantidadLetra(){
    return this.cantidadLetra;
  }

}
