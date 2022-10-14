public class DataTester {

	public static void main(String[] args)
  {

    Data mio_compleanno = new Data();

    System.out.println("Inserisci l'anno : ");

    int mio_anno = 2020;

    mio_compleanno.setAnno(mio_anno);

    System.out.println("Inserisci il mese : ");

    int mio_mese = 2;

    mio_compleanno.setMese(mio_mese);

    System.out.println("Inserisci il giorno : ");

    int mio_giorno = 29;

    mio_compleanno.setGiorno(mio_giorno);

    System.out.println("Data inserita : ");

    System.out.println("Giorno = " + mio_compleanno.getGiorno());

    System.out.println("Mese = " + mio_compleanno.getMese());

    System.out.println("Anno = " + mio_compleanno.getAnno());

  }

}
