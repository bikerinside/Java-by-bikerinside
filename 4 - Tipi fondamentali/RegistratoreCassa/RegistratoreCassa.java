/**
Un semplice registratore di cassa che somma e calcola il resto dovuto
@since Version 1.0
@author bikerinside
*/

public class RegistratoreCassa
{
    /** valore della moneta da due euro */
    public static final double DUEURO = 2.00;
    /** valore della moneta da un euro */
    public static final double UNEURO = 1.00;
    /** valore della moneta da cinquanta centesimi */
    public static final double CINQUANTACENT = 0.50;
    /** valore della moneta da venti centesimi */
    public static final double VENTICENT = 0.20;
    /** valore della moenta da dieci centesimi */
    public static final double DIECICENT = 0.10;
    /** valore della moenta da cinque centesimi */
    public static final double CINQUECENT = 0.05;
    /** valore della moneta da due centesimi */
    public static final double DUECENT = 0.02;
    /** valore della moneta da un centesimo */
    public static final double UNCENT = 0.01;
    /** totale degli acquisti */
    private double acquisto;
    /** totale dei pagamenti */
    private double pagamento;
    /**
    Costruisce un registratore di cassa senza soldi nel cassetto
    */
    public RegistratoreCassa()
    {

      acquisto = 0;

      pagamento = 0;

    }

    /**
    Registra la vendita di un articolo
    @param quantita il totale degli acquisti
    */
    public void registraAcquisto(double quantita)
    {

    acquisto += quantita;

    }

    /**
    Riceve un pagamento del cliente e lo registra.
    @param euro_due il numero di due euro
    @param euro_uno il numero di un euro
    @param euro_cinquanta_cent il numero di cinquanta centesimi
    @param euro_venti_cent il numero di venti centesimi
    @param euro_dieci_cent il numero di dieci centesimi
    @param euro_cinque_cent il numero di cinque centesimi
    @param euro_due_cent il numero di due centesimo
    @param euro_un_cent il numnero di un centesimo
    */
    public void riceviPagamento(int euro_due, int euro_uno, int euro_cinquanta_cent, int euro_venti_cent, int euro_dieci_cent, int euro_cinque_cent, int euro_due_cent, int euro_un_cent)
    {

      pagamento = DUEURO * euro_due + UNEURO * euro_uno + CINQUANTACENT * euro_cinquanta_cent + VENTICENT * euro_venti_cent + DIECICENT * euro_dieci_cent + CINQUECENT * euro_cinque_cent + DUECENT * euro_due_cent + UNCENT * euro_un_cent;

    }

    /**
    Calcola il resto dovuto al cliente e azzerra il conto per il successivo
    @return il resto dovuto al cliente
    */
    public double daiResto()
    {

      double resto = pagamento - acquisto;

      acquisto = 0;

      pagamento = 0;

      return resto;

    }

}

/* in Java per dichiarare una costante IN UNA CLASSEla sintassi è la seguente public static final tipo_dato  NOME_MAIUSCOLO = VALORE_DELLA_COSTANTE */
// invece per dichiarare una costante in file TESTER bisgona scrivere solo final tipo_dato NOME_MAIUSCOLO = VALORE;
/* La keyword static

Le variabili statiche sono più utili nelle applicazioni che richiedono contatori.
Come sapete, i contatori daranno valori errati se dichiarati come variabili normali.
Ad esempio, se hai una variabile normale impostata come contatore in un'applicazione che ha una classe, dì auto.
Quindi, ogni volta che creiamo un oggetto car, la normale variabile counter verrà inizializzata con ogni istanza.
Ma se abbiamo una variabile contatore come variabile statica o di classe, verrà inizializzata solo una volta quando viene creata la classe.
Successivamente, con ogni istanza della classe, questo contatore verrà incrementato di uno.
Questo è diverso dalla variabile normale in cui con ogni istanza il contatore verrà incrementato ma il valore del contatore sarà sempre 1.

*/
