/**
Questa classe collauda la classe Registratore Cassa
*/

public class RegistratoreCassaTester
{
  /** @param args nessun parametro */
  public static void main(String[] args)
  {

    RegistratoreCassa mio_registratore = new RegistratoreCassa();

    mio_registratore.registraAcquisto(0.75);

    mio_registratore.registraAcquisto(1.50);

    mio_registratore.riceviPagamento(2, 0, 0, 0, 0, 0, 0, 0);

    System.out.println("Resto = " + mio_registratore.daiResto());

    System.out.println("Atteso = 1.75");

    System.exit(0);

  }

}
