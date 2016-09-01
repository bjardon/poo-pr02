import java.awt.*;
import java.applet.*;

public class ErrorDeDesbordamiento extends Applet {
  long positivo = 500000000 + 500000;
  long negativo = -2- 20000;
  public void paint(Graphics g){
    g.drawString("positivo contiene: " + positivo, 5, 25);
    g.drawString("negativo contiene: " + negativo, 10, 25);
  }
}
