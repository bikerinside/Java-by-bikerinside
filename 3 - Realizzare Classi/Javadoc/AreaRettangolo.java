/**

Una semplice classe di esempio per capire l'utilizzo del tool javadoc

@author bikerinside
@since Versione 1.0

*/

public class AreaRettangolo
{
  
  /**
  base del rettangolo
  */
  
  private int base;
  
  /**
  altezza del rettangolo
  */
  
  private int altezza;
  
  /**
  Imposta la base e l'altezza  
  @param aBase è il parametro per la base
  @param aAltezza è il paramentro per l'altezza
  */
  
  public AreaRettangolo(int aBase, int aAltezza)
  {
    
    base = aBase;
    
    altezza = aAltezza;
    
  }
  
  /**
  Calcola l'area del rettangolo
  @return l'area del rettangolo
  */
  public int calcola()
  {
    
    return base * altezza;
  
  }
  
}
    
/*

Riferimenti :

https://docs.oracle.com/en/java/javase/17/javadoc/javadoc.html#GUID-9E6AB571-AB0F-4279-9BBF-C0AF83345BF0

https://docs.oracle.com/en/java/javase/17/docs/specs/javadoc/doc-comment-spec.html


https://docs.oracle.com/en/java/javase/17/docs/specs/man/javadoc.html

Utilizzo rapido del tool javadoc

javadoc -quiet -version -author AreaRettangolo.java

genererà la documentazione della classe in oggetto

se invece i file dovessero essere molteplici :

javadoc *.java

-quiet visualizza solo i messaggi di errore qualora ci fossero
-version aggiunge la versione della classe alla documentazione (solo se il tag @version è stato utilizzato)
-author aggiunge l'autore della classe alla documentazione (solo se il tag @author è stato utilizzato)

*/
