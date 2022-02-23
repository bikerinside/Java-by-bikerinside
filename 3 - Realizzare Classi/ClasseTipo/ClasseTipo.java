/*
In Java la struttura base di una classe è così composta :
il modificatore di visibilità, la parole chiave class e il nome della classe
*/

public class ClasseTipo
{
  
  /* successivamente troviamo gli attributi o membri della classe */
  private int contatore;
  
  /* subito dopo i membri della troviamo i costruttori */
  
  public ClasseTipo(int aContatore)
  {
    
    contatore = aContatore;
    
  }
  
  /* dopo i costruttori troviamo i vari metodi della classe */
  public void setContatore(int valore_contatore)
  {
    
    contatore = valore_contatore;
    
  }
  
  public int getContatore()
  {
    
    return contatore;
    
  }
  
  public void click()
  {
    
    contatore++;
    
  }

}

/*
Ricapitolando :
- I membri di una classe sono della variabili che rappresentano lo stato della classe
- I costruttori servono ad iniziliazzare l'oggetto creato.
- I metodi invece sono le "funzionalità" della classe che permettono di manipolare la classe stessa.
 */
