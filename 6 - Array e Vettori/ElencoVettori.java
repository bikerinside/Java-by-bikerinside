import java.util.ArrayList;

public class ElencoVettori
{
  
  public static void main(String[] args)
  {
    
    ArrayList<String> nomi = new ArrayList<String>();
    
    nomi.add("Vincenzo");
    nomi.add("Rosario");
    nomi.add("Maria");
    nomi.add("Mia");
    nomi.add("Michele");
    
    System.out.println(nomi);
    /* oppure */
    for(String nome : nomi)
    {
      
      System.out.println(nome);
    
    }
    
    ArrayList<Integer> numeri = new ArrayList<Integer>();
    
    numeri.add(0);
    numeri.add(1);
    numeri.add(2);
    numeri.add(3);
    numeri.add(4);
    numeri.add(5);
    
    for(Integer numero : numeri)
    {
      
      System.out.println(numero);
    
    }
    
    System.out.println("Grandezza vettore numeri = " + numeri.size());
    
    System.exit(0);
    
  }
  
}  

/*
ArrayList è detta classe generica, poiché può essere usata con qualsiasi altro tipo di classe.
Proprio per la sua particolarità ArrayList NON può essere utilizzata con tipi primiitivi,
bensi' bisogna usare le rispettive classi involucro:

byte -> Byte
boolean -> Boolean
char -> Character
double -> Double
float -> Float
int -> Integer
long -> Long
short -> Short

La conversione tra tipi primitivi e le corrispondenti classi involucro è automatica, mediante
un processo che viene chiamato auto-boxing (“auto-impacchettamento”, anche se
sarebbe stato più coerente !’utilizzo, in inglese, di auto-wrapping).

Ad esempio, se assegnate un valore di tipo double a una variabile di tipo Double, questo
viene automaticamente “inserito in una scatola” :

Double wrapper = 29.95 ;

Viceversa, i valori di tipo involucro vengono automaticamente “estratti dalla scatola”
per generare valori di tipo primitivo, mediante un processo denominato auto-unboxing:

double X = wrappe r ;

Ovviamente la classe ArrayList, contiene una serie di metodi utili alla gestione dei Vettori


Array o vettore?
Per la maggior parte dei programmatori è più semplice utilizzare un vettore, perché i
vettori aumentano e diminuiscono la propria dimensione in modo automatico. Di contro,
gli array mettono a disposizione una sintassi molto più elegante e comoda per accedere
agli elementi e per inizializzarli.
Quale contenitore è meglio utilizzare? Ecco alcuni consigli.
• Se la dimensione del contenitore non cambia mai, usate un array.
• Se dovete memorizzare una lunga sequenza di valori di tipo primitivo e dovete fare
particolarmente attenzione alPefFicienza, usate un array.
• In tutti gli altri casi usate un vettore.
*/

