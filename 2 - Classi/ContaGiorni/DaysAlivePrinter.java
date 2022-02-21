/*
Dovete scrivere un programma che calcoli il numero di giorni trascorsi dalla vostra nascita.
Dovreste evitare di guardare i dettagli realizzativi interni della classe Da y :
usate, invece, la relativa documentazione API, consultabile nel file index.html presente nella sotto-cartella api .
*/
public class DaysAlivePrinter
{
  
   public static void main(String[] args)
   {
     // costruisco un oggetto della classe Day con la data del compleanno
     Day compleanno_vincenzo = new Day(1988, 6, 26);
     // costruisco un oggetto della classe Day con la data di oggi
     Day oggi = new Day();
     // visualizzo a video tramite il metodo to string la data di nascita
     System.out.println(compleanno_vincenzo.toString());
     // conta i giorni dalla data di nascita
     System.out.println(oggi.daysFrom(compleanno_vincenzo));
     // indica che il programma è terminato con successo
     System.exit(0)

   }
 
}
