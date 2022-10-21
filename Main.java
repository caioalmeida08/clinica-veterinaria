import conexaoDB.*;
import entidades.*;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);

    ConexaoDB mysql = null;

    try {
      mysql = new ConexaoDB();
      var resultado = mysql.selectCliente("WHERE idCliente = 2").get(0);
      mysql = new ConexaoDB();
      mysql.insertCliente(resultado);

    } catch (Exception e) {
      System.out.println(e);
    }
  }
}