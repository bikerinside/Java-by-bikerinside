import java.util.Scanner;

public class LeggeDaTastiera
{

    public static void main(String[] args)
    {

        Scanner legge_da_tastiera = new Scanner(System.in);

        System.out.print("Inserire il numero delle bottiglie : ");

        int bottiglie = legge_da_tastiera.nextInt();

        System.out.println(bottiglie);

        System.out.print("Inserire il costo al litro : ");

        float prezzo = legge_da_tastiera.nextFloat();

        System.out.print(prezzo);

        System.exit(0);

    }
}

/*
Per visualizzare il prompt è meglio usare il metodo print , non il metodo println : 
in questo modo i dati forniti in ingresso verranno scritti subito dopo il carattere "due punti", 
non sulla riga seguente. Inoltre, è anche bene ricordare di inserire uno spazio dopo i "due punti". Dal momento che i dati in uscita vengono inviati a System.out , 
potreste pensare di usare System , in per ricevere dati in ingresso: sfortunatamente la cosa non è così semplice. Quando fu progettato il linguaggio Java, 
non venne riposta molta attenzione alle interazioni con la tastiera, perché si ipotizzò che tutti i programmatori 
avrebbero scritto applicazioni dotate di interfaccia grafica per l'interazione con l’utente, 
con menu e campi di testo. All’oggetto System.in venne associato un insieme di funzionalità davvero minimali e, 
per essere utilizzabile, in pratica deve essere combinato con altre classi. 
Per acquisire dati tramite la tastiera si usa la classe Scanner.

La classe Scanner appartiene al pacchetto java.util. 
Quando usate la classe Sc anner,
importatela inserendo all’inizio del file sorgente questa dichiarazione:
import java.util.Scanner;
*/