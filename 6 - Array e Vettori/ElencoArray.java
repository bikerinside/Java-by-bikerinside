import java.util.Scanner;

public class ElencoArray
{
  
  public static void main(String[] args)
  {
    
    /* dichiaro un array di interi contenente otto punteggi */
    int[] punteggi = { 5, 10, 6, 9, 8, 2, 7, 2};
    /* possiamo anche stabilire la lunghezza contestualmente alla dichiarazione dell'array tramite costante*/
    final int N_STUDENTI = 10;
    
    int[] voti = new int[N_STUDENTI];
    
    /* oppure la lunghezza puo' essere specificata tramite una variabile */
    Scanner in = new Scanner(System.in);
    /* legge da tastiera il numero di elementi */
    int numero_prodotti = in.nextInt();
    
    double[] prezzi = new double[numero_prodotti];
    /* mostriamo ora come accedere ai vari elementi di un array */
    System.out.println(punteggi[0]); /* visualizza il primo punteggio dell'array punteggi ovvero 5 */
    /* ciclo for o ciclo while */
    int i = 0;
    
    while(i < N_STUDENTI)
    {
      
      voti[i] = i;
      
      i++;
    
    }
    
    for(i = 0; i < N_STUDENTI; i++)
    {
      /* visualizzera' 10 zeri poiche' l'array voti e' vuoto */
      System.out.println(voti[i]);
      
    }
    /* oppure con un ciclo for esteso del tipo */
    int totale = 0;
    /* singo_volo assumera' ad ogni passo il valore dell'array voti cioe' 0,1,2,3,4,5 ad ogni passo verra' sommato questo valore alla variabile totale */
    for(int singolo_voto : voti)
    {
      
      totale += singolo_voto;
    
    }
    
    System.out.println("totale = " + totale);
    
    System.exit(0);
    
  }
  
} 

/*
Come abbiamo visto gli array hanno un grosso limite e cioe' quello di dover definire a priori la loro grandezza
rendendoli di fatto finiti, quindi non possiamo usarli se non conosciamo fin dall'inizio la quantita' di dati da memorizzare
per questo motivo nel prossimo file.java vedremo l'uso dei Vettori in Java.
Inoltre includendo :

import java.util.Arrays;

si possono utilizzare tutta una serie di metodi utili alla manipolazione degli array
*/
